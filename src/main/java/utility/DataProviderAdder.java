package main.java.utility;



import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DataProviderAdder implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        if (annotation != null) {

            annotation.setDataProvider("getData");

            annotation.setDataProviderClass(DataUtil.class);

        }

    }
}
