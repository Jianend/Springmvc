package com.jianen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.jianen.service"})
@Import({MyBatisConfig.class,jdbcConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
