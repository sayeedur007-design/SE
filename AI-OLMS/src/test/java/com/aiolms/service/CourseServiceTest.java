package com.aiolms.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseServiceTest {

    private final CourseService courseService = new CourseService();

    @Test
    void returnsAllDefaultCourses() {
        List<String> courses = courseService.getCourses();
        assertEquals(4, courses.size());
        assertTrue(courses.contains("Java Programming"));
        assertTrue(courses.contains("Artificial Intelligence"));
    }

    @Test
    void returnsExpectedCourseCount() {
        assertEquals(4, courseService.getCourseCount());
    }

    @Test
    void checksCourseAvailabilityCaseInsensitively() {
        assertTrue(courseService.hasCourse("machine learning"));
        assertFalse(courseService.hasCourse("Unknown Course"));
        assertFalse(courseService.hasCourse("  "));
        assertFalse(courseService.hasCourse(null));
    }
}
