package com.ning.mall.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * ClassName: MallFileApplication
 * Description:
 * date: 2021/3/31 10:30
 *
 * @author ningjianjian
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MallFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallFileApplication.class,args);
    }
}
