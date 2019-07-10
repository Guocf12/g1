package com.briup.apps.sms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.apps.sms.dao")
public class MybatisConfig {

}
