/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.workday;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class WorkdayEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":entity:path";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(12);
        set.add("entity");
        set.add("path");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("httpConnectionManager");
        set.add("synchronous");
        set.add("reportFormat");
        set.add("host");
        set.add("clientId");
        set.add("clientSecret");
        set.add("tokenRefresh");
        set.add("tenant");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "workday".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "entity", null, true, copy);
        uri = buildPathParameter(syntax, uri, "path", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

