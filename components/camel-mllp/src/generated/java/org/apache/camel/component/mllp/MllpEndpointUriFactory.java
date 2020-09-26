/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mllp;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MllpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":hostname:port";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(31);
        set.add("hostname");
        set.add("port");
        set.add("autoAck");
        set.add("bufferWrites");
        set.add("hl7Headers");
        set.add("requireEndOfData");
        set.add("stringPayload");
        set.add("validatePayload");
        set.add("bridgeErrorHandler");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("charsetName");
        set.add("backlog");
        set.add("keepAlive");
        set.add("lenientBind");
        set.add("maxConcurrentConsumers");
        set.add("receiveBufferSize");
        set.add("reuseAddress");
        set.add("sendBufferSize");
        set.add("tcpNoDelay");
        set.add("acceptTimeout");
        set.add("bindRetryInterval");
        set.add("bindTimeout");
        set.add("connectTimeout");
        set.add("idleTimeout");
        set.add("maxReceiveTimeouts");
        set.add("readTimeout");
        set.add("receiveTimeout");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "mllp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "hostname", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
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

