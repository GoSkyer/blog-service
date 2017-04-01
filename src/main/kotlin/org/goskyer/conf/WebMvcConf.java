package org.goskyer.conf;

import org.goskyer.domain.SystemSetting;
import org.goskyer.interceptor.UserSecurityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Configuration
public class WebMvcConf extends WebMvcConfigurerAdapter {
    @Value("${pic.home}")
    private String picHome;

    private UserSecurityInterceptor securityInterceptor;

    @Autowired
    public WebMvcConf(UserSecurityInterceptor securityInterceptor) {
        super();
        this.securityInterceptor = securityInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(securityInterceptor).addPathPatterns("/admin/**");//配置登录拦截器拦截路径
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("*");
        configuration.addAllowedHeader("*");
        configuration.setAllowedMethods(Arrays.asList("GET", "PUT", "POST","DELETE"));
        source.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(source);
    }

    @Bean
    public SystemSetting systemSetting(){
        return SystemSetting.builder()
                .picHome(picHome)
                .build();
    }
}
