package com.lxy.newsshow.configs;

import com.lxy.newsshow.componets.LoginHandleInterceptor;
import com.lxy.newsshow.componets.MYLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class myMvcconfig implements WebMvcConfigurer {

//    添加视图映射
        public void addViewControllers(ViewControllerRegistry registry) {
//            首页映射
            registry.addViewController("/").setViewName("welcome");
            registry.addViewController("/index").setViewName("index");
            registry.addViewController("/regist").setViewName("/User/register");
        }
//       配置localeResolver
        @Bean
        public LocaleResolver localeResolver(){
            return new MYLocalResolver();
        }

        //    添加资源列表
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/","classpath:/static/");
    }
//    配置过滤器
   /* @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandleInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/welcome.html","/index.html","/","/login","/webjars/**","/static/**");
    }*/
}
