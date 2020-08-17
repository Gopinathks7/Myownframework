package com.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class AnnotationTrans implements IAnnotationTransformer
{

	public void transform(ITestAnnotation testAnnotation,Class testClass,Constructor testConstructor,Method method)
	{
		testAnnotation.setRetryAnalyzer(RetyrTesting.class);
	}
}
