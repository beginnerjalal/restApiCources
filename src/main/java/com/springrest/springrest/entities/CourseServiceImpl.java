package com.springrest.springrest.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.services.CourseService;
//import com.springrest.springrest.services.course;
@Service
public class CourseServiceImpl implements CourseService {
	
List<Course> list;	
	
public CourseServiceImpl() {
	list = new ArrayList <>();
	list.add(new Course(123,"java","ok this is course"));
	list.add(new Course(456,"java script","ok this is course"));
	list.add(new Course(789,"python","ok this is course"));
	list.add(new Course(111,"html","ok this is course"));
	
}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list ) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
