package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author dignzf
 * prometheus 配置
 * 2019年3月5日
 */

@Configuration
public class MonitoringConfig {
    /*
     * @Bean SpringBootMetricsCollector
     * springBootMetricsCollector(Collection<PublicMetrics> publicMetrics) {
     * 
     * SpringBootMetricsCollector springBootMetricsCollector = new
     * SpringBootMetricsCollector(publicMetrics);
     * springBootMetricsCollector.register(); return springBootMetricsCollector; }
     * 
     * @SuppressWarnings("all")
     * 
     * @Bean ServletRegistrationBean servletRegistrationBean() {
     * DefaultExports.initialize(); return new ServletRegistrationBean(new
     * MetricsServlet(), "/prometheus"); }
     */
}
