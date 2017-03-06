package org.goskyer.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by OoO on 2017/3/4.
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DruidDataSourceAuto {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setTestOnBorrow(true);

        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dataSource;
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }

}
