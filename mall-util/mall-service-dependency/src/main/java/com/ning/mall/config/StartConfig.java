package com.ning.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ServiceConfig
 * Description:
 * date: 2021/3/30 13:50
 *
 * @author ningjianjian
 */
@Configuration
public class StartConfig {

    /**
     *  // 旧版分页拦截器
     * @return
     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor(){
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        paginationInterceptor.setDbType(DbType.MYSQL);
//        return paginationInterceptor;
//    }

    /**
     *  // 最新版分页拦截器
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

}
