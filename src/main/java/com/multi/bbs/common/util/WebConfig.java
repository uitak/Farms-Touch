package com.multi.bbs.common.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthCheckInterceptor())
				.addPathPatterns("/board/*/write/**")
				.addPathPatterns("/board/update/**")
				.addPathPatterns("/board/reply/**")
				.addPathPatterns("/blog/write/**")
				.addPathPatterns("/blog/update/**")
				.addPathPatterns("/blog/comment/**");
	}
}