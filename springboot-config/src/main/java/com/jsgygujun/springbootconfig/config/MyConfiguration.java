package com.jsgygujun.springbootconfig.config;

import com.jsgygujun.springbootconfig.client.KVClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GuJun
 * @date 2020/11/16
 */
@Configuration
public class MyConfiguration {
    @Bean(value = "kvClient")
    @ConditionalOnProperty(prefix = "repository.kv", name = "on", havingValue = "true")
    public KVClient createKVClient() {
        return new KVClient();
    }
}
