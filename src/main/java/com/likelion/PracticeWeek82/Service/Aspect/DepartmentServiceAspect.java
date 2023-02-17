package com.likelion.PracticeWeek82.Service.Aspect;

import com.likelion.PracticeWeek82.Service.DepartmentService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DepartmentServiceAspect {
    private DepartmentService departmentService;
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceAspect.class);
    @Before("execution(* com.likelion.PracticeWeek82.Service.DepartmentService.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Before called method " + joinPoint.toString());
    }
    @After("execution(* com.likelion.PracticeWeek82.Service.DepartmentService.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info("After called method " + joinPoint.toString());
    }
}
