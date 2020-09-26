/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class BoxEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(23);
        set.add("apiName");
        set.add("methodName");
        set.add("clientId");
        set.add("enterpriseId");
        set.add("inBody");
        set.add("userId");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("httpParams");
        set.add("synchronous");
        set.add("authenticationType");
        set.add("accessTokenCache");
        set.add("clientSecret");
        set.add("encryptionAlgorithm");
        set.add("maxCacheEntries");
        set.add("privateKeyFile");
        set.add("privateKeyPassword");
        set.add("publicKeyId");
        set.add("sslContextParameters");
        set.add("userName");
        set.add("userPassword");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "box".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return true;
    }
}

