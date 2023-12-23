package com.microservicecommandes.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservice-commande")
@RefreshScope
public class ApplicationPropertiesConfiguration {
    private int limitDeCommandes;
    public int getLimitDeCommandes() {
        return limitDeCommandes;
    }
    public void setLimitDeCommandes(int limitDeCommandes) {
        this.limitDeCommandes = limitDeCommandes;
    }
}
