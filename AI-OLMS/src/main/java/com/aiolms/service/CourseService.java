package com.aiolms.service;

import java.util.List;

/**
 * Provides the catalog of courses offered in AI-OLMS.
 */
public class CourseService {

    private static final List<String> COURSES = List.of(
        "Java Programming",
        "Python Programming",
        "Machine Learning",
        "Artificial Intelligence"
    );

    /**
     * Returns the immutable list of available course titles.
     */
    public List<String> getCourses() {
        return COURSES;
    }

    /**
     * Returns the total number of available courses.
     */
    public int getCourseCount() {
        return COURSES.size();
    }

    /**
     * Checks whether a course with the given title exists (case-insensitive).
     */
    public boolean hasCourse(String title) {
        if (title == null || title.isBlank()) {
            return false;
        }
        return COURSES.stream().anyMatch(course -> course.equalsIgnoreCase(title.trim()));
    }
}
