package com.jacken.springcglib.config;




import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 申明一个切面，AOP的最终目的是增强一个方法
 */
@Component
@Aspect
public class NotVeryUseFulAspectJ {
    /**
     * 声明一个切点
     * Joint point 就是一个方法在aop中
     * 这些方法加在 一起就是一个pointcut
     * 切点：是一系列的连接点的集合
     */
    @Pointcut("execution(* com.jacken.springcglib.dao..*.*(..))")
    private  void andOldTransfer(){}

    /**
     * 前置通知，在这些连接点之前执行
     *
     * 切入连接点的时机和切入连接点的内容
     */
    @Before("andOldTransfer()")
    public  void adviceBefore(){

        System.out.println("Before Advice beginning");
        System.out.println("*****************");
    }

//    /**
//     * 后置通知，在这些连接点之后执行
//     */
//    @After("andOldTransfer()")
//    public  void adviceAfter(){
//        System.out.println("After Advice beginning");
//    }
}
