package com.conka.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // /courses
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn AWS", "KeM90"),
            new Course(2, "Learn DevOps", "KeM90"),
            new Course(3, "Learn DevTools", "KeM90")

        );
    }


}
