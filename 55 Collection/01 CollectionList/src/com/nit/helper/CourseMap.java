// project 2 xpg 57
package com.nit.helper;				// INCOMPLETE

import java.util.HashMap;

public class CourseMap {
	private static HashMap course=new HashMap<>();
	
	static {
		course.put("java", 1);
		course.put("c language", 2);
		course.put("adv java", 3);
		course.put("crt", 4);
		course.put("data structure", 5);
	}
	public static int getCourseNum(String courses) {
		return (Integer)course.get(courses.toUpperCase());
	}
}
