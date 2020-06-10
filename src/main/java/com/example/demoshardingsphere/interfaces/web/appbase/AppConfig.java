package com.example.demoshardingsphere.interfaces.web.appbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.demoshardingsphere.infrastructure.dao.mapper")
public class AppConfig {

}
