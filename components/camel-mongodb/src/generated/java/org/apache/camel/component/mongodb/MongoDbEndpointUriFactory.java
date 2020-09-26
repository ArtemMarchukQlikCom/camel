/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MongoDbEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":connectionBean";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(27);
        set.add("connectionBean");
        set.add("collection");
        set.add("collectionIndex");
        set.add("createCollection");
        set.add("database");
        set.add("mongoConnection");
        set.add("operation");
        set.add("outputType");
        set.add("bridgeErrorHandler");
        set.add("consumerType");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("cursorRegenerationDelay");
        set.add("dynamicity");
        set.add("readPreference");
        set.add("synchronous");
        set.add("writeConcern");
        set.add("writeResultAsHeader");
        set.add("streamFilter");
        set.add("persistentId");
        set.add("persistentTailTracking");
        set.add("tailTrackCollection");
        set.add("tailTrackDb");
        set.add("tailTrackField");
        set.add("tailTrackIncreasingField");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "mongodb".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "connectionBean", null, true, copy);
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

