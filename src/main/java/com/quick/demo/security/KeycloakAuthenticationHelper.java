package com.quick.demo.security;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.IDToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class KeycloakAuthenticationHelper implements IKeycloakAuthenticationHelper {
	
	private IDToken token;

	public IDToken getToken() {
		
		if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof KeycloakPrincipal) {
			KeycloakPrincipal<KeycloakSecurityContext> kp = (KeycloakPrincipal<KeycloakSecurityContext>) SecurityContextHolder
					.getContext().getAuthentication().getPrincipal();
			token = kp.getKeycloakSecurityContext().getIdToken();
		}
		
		return token;
	}	
	
}
