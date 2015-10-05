package com.himline.practice;

import java.lang.annotation.ElementType;
import java.lang.reflect.AnnotatedElement;

public class Check {
public static void main(AnnotatedElement ElementType ){
	// getAnnotation returns Annotation type
	Alpha singleAnnotation = 
            ElementType.getAnnotation(Alpha.class);
	Alpha header = (Alpha) singleAnnotation;
	 System.out.printf("Developer: " + header.createdBy());
}

}
