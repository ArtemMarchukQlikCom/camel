/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.persistent_volumes;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class KubernetesPersistentVolumesEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":masterUrl";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(23);
        set.add("masterUrl");
        set.add("apiVersion");
        set.add("dnsDomain");
        set.add("kubernetesClient");
        set.add("lazyStartProducer");
        set.add("operation");
        set.add("portName");
        set.add("portProtocol");
        set.add("basicPropertyBinding");
        set.add("connectionTimeout");
        set.add("synchronous");
        set.add("caCertData");
        set.add("caCertFile");
        set.add("clientCertData");
        set.add("clientCertFile");
        set.add("clientKeyAlgo");
        set.add("clientKeyData");
        set.add("clientKeyFile");
        set.add("clientKeyPassphrase");
        set.add("oauthToken");
        set.add("password");
        set.add("trustCerts");
        set.add("username");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "kubernetes-persistent-volumes".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "masterUrl", null, true, copy);
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

