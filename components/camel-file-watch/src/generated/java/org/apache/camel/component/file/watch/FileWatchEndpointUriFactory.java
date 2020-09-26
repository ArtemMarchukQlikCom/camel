/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.watch;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class FileWatchEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":path";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(15);
        set.add("path");
        set.add("antInclude");
        set.add("autoCreate");
        set.add("bridgeErrorHandler");
        set.add("concurrentConsumers");
        set.add("events");
        set.add("fileHasher");
        set.add("pollThreads");
        set.add("queueSize");
        set.add("recursive");
        set.add("useFileHashing");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "file-watch".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

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

