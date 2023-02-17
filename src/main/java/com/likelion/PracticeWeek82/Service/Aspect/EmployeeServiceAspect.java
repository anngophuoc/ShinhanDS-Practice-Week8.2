package com.likelion.PracticeWeek82.Service.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EmployeeServiceAspect {
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceAspect.class);
    @AfterThrowing("execution(* com.likelion.PracticeWeek82.Service.EmployeeService.*(..))")
    public void afterError(JoinPoint joinPoint){
        logger.info("Error at method "+ joinPoint.toString());
    }
}
