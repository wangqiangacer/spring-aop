package com.jacken.springcglib.test;

import com.jacken.springcglib.config.Appconfig;
import com.jacken.springcglib.dao.UserDao;
import org.apache.catalina.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1.AOP:面向切面编程，实现的两种方式：1>spring Aop,2>AspectJ
 * 主要是对方法的增强
 */
public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        UserDao userDao = (UserDao) context.getBean(UserDao.class);
        userDao.query();
    }
}
