package com.imooc.demo.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * Created by ljd on 2020/9/7.
 */
@Configuration
//配置mybatis mapper的扫描路径
@MapperScan("com.imooc.demo.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);//alt+enter自动创建
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后，不自动提交，通过事务控制提交
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
