package com.demo.react.springboot_react.config;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        serveDirectory(registry, "/", "classpath:/static/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOriginPatterns("*");
    }


    private void serveDirectory(ResourceHandlerRegistry registry, String endpoint, String location) {
        // Create an array of endpoint patterns.
        String[] endpointPatterns = endpoint.endsWith("/")
                ? new String[]{
                    endpoint.substring(0, endpoint.length() - 1),
                    endpoint,
                    endpoint + "**"
                }
                : new String[]{
                    endpoint,
                    endpoint + "/",
                    endpoint + "/**"
                };

        registry
            .addResourceHandler(endpointPatterns)
            .addResourceLocations(location.endsWith("/") ? location : location + "/")
            .resourceChain(false)
            .addResolver(new PathResourceResolver() {
                @Override
                public Resource resolveResource(HttpServletRequest request, String requestPath,
                                                List<? extends Resource> locations, org.springframework.web.servlet.resource.ResourceResolverChain chain) {
                    Resource resource = super.resolveResource(request, requestPath, locations, chain);
                    // If the resource is found, return it.
                    if (resource != null) {
                        return resource;
                    }
                    // If not, fallback to index.html
                    return super.resolveResource(request, "/index.html", locations, chain);
                }
            });
    }
}
