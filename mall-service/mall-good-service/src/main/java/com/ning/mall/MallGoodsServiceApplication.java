package com.ning.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName: MallGoodsServiceApplication
 * Description:
 * date: 2021/3/30 12:33
 *
 * @author ningjianjian
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.ning.mall.goods.mapper"})
public class MallGoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGoodsServiceApplication.class,args);
    }
}