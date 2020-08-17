package com.wed;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class Annottran implements IAnnotationTransformer
{
public void transform(ITestAnnotation annotation,Class claa,Constructor con,Method me)
{
	annotation.setRetryAnalyzer(Retest.class);
}
}
