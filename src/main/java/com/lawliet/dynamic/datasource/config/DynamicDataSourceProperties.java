package com.lawliet.dynamic.datasource.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "spring.datasource")
public class DynamicDataSourceProperties {

    private Map<String, DataSourceProperties> dynamic = new LinkedHashMap<>();
}
