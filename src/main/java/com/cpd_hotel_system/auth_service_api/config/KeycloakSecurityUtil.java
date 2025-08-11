package com.cpd_hotel_system.auth_service_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.keycloak.admin.client.Keycloak;


@Component
public class KeycloakSecurityUtil {

    Keycloak keycloak;

    @Value("${keycloak.config.server-url}")
    private String serverUrl;

    @Value("${keycloak.config.client-id}")
    private String realm;

    @Value("${keycloak.config.client-id}")
    private String clientId;

    @Value("${keycloak.config.grant-type}")
    private String grantType;

    @Value("${keycloak.config.username}")
    private String username;

    @Value("${keycloak.config.password}")
    private String password;

    @Value("${keycloak.config.secret}")
    private String secret;
}
