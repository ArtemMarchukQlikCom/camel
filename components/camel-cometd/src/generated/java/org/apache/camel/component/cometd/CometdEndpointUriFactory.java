/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CometdEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/channelName";
    private static final String[] SCHEMES = new String[]{"cometd", "cometds"};

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(21);
        set.add("host");
        set.add("port");
        set.add("channelName");
        set.add("allowedOrigins");
        set.add("baseResource");
        set.add("crossOriginFilterOn");
        set.add("filterPath");
        set.add("interval");
        set.add("jsonCommented");
        set.add("logLevel");
        set.add("maxInterval");
        set.add("multiFrameInterval");
        set.add("timeout");
        set.add("bridgeErrorHandler");
        set.add("sessionHeadersEnabled");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("disconnectLocalSession");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
        uri = buildPathParameter(syntax, uri, "channelName", null, true, copy);
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

