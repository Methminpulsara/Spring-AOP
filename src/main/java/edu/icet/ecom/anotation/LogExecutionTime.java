package edu.icet.ecom.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//run time ekeedi run wenna metha thibboth
@Retention(RetentionPolicy.RUNTIME)

// method uda run krnnna kiyla dnaw
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}
