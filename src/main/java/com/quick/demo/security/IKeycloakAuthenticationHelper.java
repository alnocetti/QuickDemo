package com.quick.demo.security;

import org.keycloak.representations.IDToken;

public interface IKeycloakAuthenticationHelper {
	IDToken getToken();
}
