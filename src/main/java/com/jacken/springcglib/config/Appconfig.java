package com.jacken.springcglib.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan("com.jacken.springcglib")
@Configuration
@EnableAspectJAutoProxy//开启支持切面
public class Appconfig {

}
