package edu.icet.ecom.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Slf4j
public class TimeLoggerAspect {

    @Around("@annotation(edu.icet.ecom.anotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();


        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
       int count  = method.getParameterCount();



        //signature name
        String name = joinPoint.getSignature().getName();
        //method methnata gnnw
        Object proceed = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        log.info("Execution Time in your {} is {}ms  /  PARAMETER count {}" ,name,endTime-startTime,count);

        return proceed;
    }
}
