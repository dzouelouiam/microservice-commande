package com.microservicecommandes.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservice-commande")
@RefreshScope
public class ApplicationPropertiesConfiguration {
    // correspond à la propriété « mes-configs.limitDeProduits » dans le fichier de configuration du MS
    private int limitDeCommandes;
    public int getLimitDeProduits() {
        return limitDeCommandes;
    }
    public void setLimitDeProduits(int limitDeProduits) {
        this.limitDeCommandes = limitDeProduits;
    }
}
