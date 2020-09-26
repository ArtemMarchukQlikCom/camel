/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XsltEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(16);
        set.add("resourceUri");
        set.add("contentCache");
        set.add("deleteOutputFile");
        set.add("failOnNullBody");
        set.add("lazyStartProducer");
        set.add("output");
        set.add("transformerCacheSize");
        set.add("basicPropertyBinding");
        set.add("entityResolver");
        set.add("errorListener");
        set.add("resultHandlerFactory");
        set.add("synchronous");
        set.add("transformerFactory");
        set.add("transformerFactoryClass");
        set.add("transformerFactoryConfigurationStrategy");
        set.add("uriResolver");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "xslt".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "resourceUri", null, true, copy);
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

