package org.apereo.cas.configuration.model.support.trusted;

import org.apereo.cas.configuration.model.core.authentication.PersonDirectoryPrincipalResolverProperties;

/**
 * This is {@link TrustedAuthenticationProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class TrustedAuthenticationProperties extends PersonDirectoryPrincipalResolverProperties {
    private static final long serialVersionUID = 279410895614233349L;
    /**
     * Indicates the name of the authentication handler.
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
