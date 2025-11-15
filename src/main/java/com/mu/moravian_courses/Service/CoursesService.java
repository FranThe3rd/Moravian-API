package com.mu.moravian_courses.Service;

import com.mu.moravian_courses.Repository.CoursesRepository;
import com.mu.moravian_courses.Entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service annotation
 * -------------------
 * Marks this class as a "service" in Spring Boot.
 * Services contain business logic and interact with repositories.
 * Spring will automatically detect and manage this class.
 */
@Service
public class CoursesService {

    /**
     * final keyword
     * -------------------
     * Means this variable cannot be reassigned after being set.
     * We use final for dependencies to make them immutable.
     */
    private final CoursesRepository coursesRepository;

    /**
     * @Autowired annotation
     * -------------------
     * Tells Spring to automatically inject the dependency.
     * Here, Spring provides an instance of CoursesRepository.
     */
    @Autowired
    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    /**
     * Fetch all courses from the database.
     */
    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    /**
     * Fetch courses by course code (partial match, case-insensitive)
     */
    public List<Courses> getCoursesByCode(String courseCode) {
        return coursesRepository.findByCourseCodeContainingIgnoreCase(courseCode);
    }

    /**
     * Fetch courses by instructor name (partial match, case-insensitive)
     */
    public List<Courses> getCoursesByInstructor(String instructor) {
        return coursesRepository.findByInstructorContainingIgnoreCase(instructor);
    }

    /**
     * Fetch courses by days (partial match, case-insensitive)
     */
    public List<Courses> getCoursesByDays(String days) {
        return coursesRepository.findByDaysIgnoreCase(days);
    }

    /**
     * Search courses by part of the title (partial match, case-insensitive)
     */
    public List<Courses> getCoursesByTitle(String titlePart) {
        return coursesRepository.findByTitleContainingIgnoreCase(titlePart);
    }

    public List<Courses> getCourseByLinc(String linc) {
        return coursesRepository.findByLincIgnoreCase(linc);
    }
}
