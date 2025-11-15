package com.mu.moravian_courses.Controller;

import com.mu.moravian_courses.Entity.Courses;
import com.mu.moravian_courses.Service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController annotation
 * -------------------------
 * Marks this class as a REST controller.
 * Handles HTTP requests and returns JSON responses by default.
 *
 * @RequestMapping(path = "api/v1/moraviancourses")
 * -------------------------
 * Sets the base URL for all endpoints in this controller.
 */
@RestController
@RequestMapping(path = "api/v1/moraviancourses")
@CrossOrigin(origins = "*") // Allow CORS

public class CoursesController {

    private final CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    /**
     * GET endpoint to fetch all courses.
     * URL: /api/v1/moraviancourses/all
     */
    @GetMapping("/all")
    public List<Courses> getAllCourses() {
        return coursesService.getAllCourses();
    }

    /**
     * GET endpoint to fetch courses by course code (partial match, case-insensitive).
     * URL example: /api/v1/moraviancourses/code/CSCI
     */
    @GetMapping("/code/{courseCode}")
    public List<Courses> getCoursesByCode(@PathVariable String courseCode) {
        return coursesService.getCoursesByCode(courseCode);
    }

    /**
     * GET endpoint to fetch courses by instructor name (partial match, case-insensitive).
     * URL example: /api/v1/moraviancourses/instructor/Jones
     */
    @GetMapping("/instructor/{instructor}")
    public List<Courses> getCoursesByInstructor(@PathVariable String instructor) {
        return coursesService.getCoursesByInstructor(instructor);
    }

    /**
     * GET endpoint to fetch courses by days (partial match, case-insensitive).
     * URL example: /api/v1/moraviancourses/days/MWF
     */
    @GetMapping("/days/{days}")
    public List<Courses> getCoursesByDays(@PathVariable String days) {
        return coursesService.getCoursesByDays(days);
    }

    /**
     * GET endpoint to fetch courses that contain a specific part of the title (case-insensitive).
     * URL example: /api/v1/moraviancourses/title/genetics
     */
    @GetMapping("/title/{titlePart}")
    public List<Courses> searchCoursesByTitle(@PathVariable String titlePart) {
        return coursesService.getCoursesByTitle(titlePart);
    }

    @GetMapping("/linc/{linc}")
    public List<Courses> searchCourseByLinc(@PathVariable String linc) {
        return coursesService.getCourseByLinc(linc);
    }
}
