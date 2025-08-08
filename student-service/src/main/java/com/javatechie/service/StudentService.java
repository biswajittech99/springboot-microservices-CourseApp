package com.javatechie.service;

import com.javatechie.client.CourseClient;
import com.javatechie.dto.Course;
import com.javatechie.dto.Rating;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentService {

//    @Autowired
//    private CourseRestClientService courseClient;

    @Autowired
    private CourseClient courseClient;

    public Course searchCourse(int courseId) {
        log.info("EDU-202: Searching course by ID: {}", courseId);
        return courseClient.course(courseId);
    }

    public List<Course> getAllCourses() {
        log.info("EDU-202: Fetching all courses");
        return courseClient.courses();
    }

    public String submitRating(int courseId, Rating rating) {
        log.info("EDU-202: Submitting rating for courseId {}: {}", courseId, rating);
        return courseClient.submitRating(courseId, rating);
    }
}
