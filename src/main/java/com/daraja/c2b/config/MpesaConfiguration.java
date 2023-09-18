package com.daraja.c2b.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@ConfigurationProperties(prefix = "mpesa.daraja")
public class MpesaConfiguration {
    private String consumerKey;
    private String consumerSecret;
    private String grantType;
    private String oauthEndpoint;
    private String registerUrlEndpoint;
    private String simulateTransactionEndpoint;
    private String shortCode;
    private String confirmationURL;
    private String validationURL;
    private String responseType;

    @Override
    public String toString() {
        return String.format("{consumerKey='%s', consumerSecret='%s', grantType='%s', oauthEndpoint='%s'}",
                consumerKey, consumerSecret, grantType, oauthEndpoint);
    }

//    public Object getConsumerKey() {
//        return String.format("{consumerKey='%s'}",
//                consumerKey);
//    }
//
//    public Object getConsumerSecret() {
//        return String.format("{consumerSecret='%s'}",
//                consumerSecret);
//    }
//
//    public Object getOauthEndpoint() {
//        return String.format("{oauthEndpoint='%s'}",
//                oauthEndpoint);
//    }
//
//    public Object getGrantType() {
//        return String.format("{grantType='%s'}",
//                grantType);
//    }
}
