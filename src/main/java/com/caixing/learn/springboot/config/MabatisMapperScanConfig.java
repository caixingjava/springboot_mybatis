package com.caixing.learn.springboot.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * 
 * <Description> mybatis的扫描配置文件 <br> 
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年3月27日 <br>
 */
@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MabatisMapperScanConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.caixing.learn.springboot.mapper");
        return mapperScannerConfigurer;
    }
}
