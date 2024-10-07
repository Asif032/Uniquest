package com.asif732.uniquest.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseResource {

  private final CourseRepository courseRepository;

  public CourseResource(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  @GetMapping
  public List<Course> retrieveAllCourses() {
    return courseRepository.findAll();
  }
}
