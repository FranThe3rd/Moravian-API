package com.mu.moravian_courses.Repository;

import com.mu.moravian_courses.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository = your data access layer.
 * -------------------
 * It allows you to query the "courses" table without writing SQL.
 * Spring Data JPA automatically generates queries based on method names.
 *
 * JpaRepository<Courses, Long>:
 *   - Courses = entity mapped to your "courses" table
 *   - Long = type of the primary key (id)
 *
 * This interface is automatically implemented by Spring at runtime.
 */
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {

    /**
     * Finds all courses where course_code contains the given string (case-insensitive).
     * Example: "CSCI" will match "CSCI 212", "CSCI 213", etc.
     * SQL equivalent: SELECT * FROM courses WHERE course_code ILIKE %?%;
     */
    List<Courses> findByCourseCodeContainingIgnoreCase(String courseCode);

    /**
     * Finds all courses taught by instructors whose name contains the given string (case-insensitive).
     */
    List<Courses> findByInstructorContainingIgnoreCase(String instructor);

    /**
     * Finds all courses held on days containing the given string (case-insensitive).
     * Example: "MWF" matches courses scheduled on Monday, Wednesday, Friday.
     */
    List<Courses> findByDaysIgnoreCase(String days);

    /**
     * Finds all courses where the title contains the given string (case-insensitive).
     * Example: "Genetics" matches "Genetics Lab", "Advanced Genetics", etc.
     */
    List<Courses> findByTitleContainingIgnoreCase(String titlePart);

    /**
     * Finds all courses for specific linc requirements.
     * Example: "M4,M5,U1"
     */
    List<Courses> findByLincIgnoreCase(String linc);
}

