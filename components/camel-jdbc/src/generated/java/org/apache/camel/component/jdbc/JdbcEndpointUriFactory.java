/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jdbc;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class JdbcEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":dataSourceName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(16);
        set.add("dataSourceName");
        set.add("allowNamedParameters");
        set.add("lazyStartProducer");
        set.add("outputClass");
        set.add("outputType");
        set.add("parameters");
        set.add("readSize");
        set.add("resetAutoCommit");
        set.add("transacted");
        set.add("useGetBytesForBlob");
        set.add("useHeadersAsParameters");
        set.add("useJDBC4ColumnNameAndLabelSemantics");
        set.add("basicPropertyBinding");
        set.add("beanRowMapper");
        set.add("prepareStatementStrategy");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "jdbc".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "dataSourceName", null, true, copy);
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

