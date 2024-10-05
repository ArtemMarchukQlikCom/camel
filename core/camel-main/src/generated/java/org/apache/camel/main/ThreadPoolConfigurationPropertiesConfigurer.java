/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.ThreadPoolConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class ThreadPoolConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AllowCoreThreadTimeOut", java.lang.Boolean.class);
        map.put("Config", java.util.Map.class);
        map.put("KeepAliveTime", java.lang.Long.class);
        map.put("MaxPoolSize", java.lang.Integer.class);
        map.put("MaxQueueSize", java.lang.Integer.class);
        map.put("PoolSize", java.lang.Integer.class);
        map.put("RejectedPolicy", org.apache.camel.util.concurrent.ThreadPoolRejectedPolicy.class);
        map.put("TimeUnit", java.util.concurrent.TimeUnit.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(ThreadPoolConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.ThreadPoolConfigurationProperties target = (org.apache.camel.main.ThreadPoolConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcorethreadtimeout":
        case "allowCoreThreadTimeOut": target.setAllowCoreThreadTimeOut(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "config": target.setConfig(property(camelContext, java.util.Map.class, value)); return true;
        case "keepalivetime":
        case "keepAliveTime": target.setKeepAliveTime(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxpoolsize":
        case "maxPoolSize": target.setMaxPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.setMaxQueueSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "poolsize":
        case "poolSize": target.setPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "rejectedpolicy":
        case "rejectedPolicy": target.setRejectedPolicy(property(camelContext, org.apache.camel.util.concurrent.ThreadPoolRejectedPolicy.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcorethreadtimeout":
        case "allowCoreThreadTimeOut": return java.lang.Boolean.class;
        case "config": return java.util.Map.class;
        case "keepalivetime":
        case "keepAliveTime": return java.lang.Long.class;
        case "maxpoolsize":
        case "maxPoolSize": return java.lang.Integer.class;
        case "maxqueuesize":
        case "maxQueueSize": return java.lang.Integer.class;
        case "poolsize":
        case "poolSize": return java.lang.Integer.class;
        case "rejectedpolicy":
        case "rejectedPolicy": return org.apache.camel.util.concurrent.ThreadPoolRejectedPolicy.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.ThreadPoolConfigurationProperties target = (org.apache.camel.main.ThreadPoolConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcorethreadtimeout":
        case "allowCoreThreadTimeOut": return target.getAllowCoreThreadTimeOut();
        case "config": return target.getConfig();
        case "keepalivetime":
        case "keepAliveTime": return target.getKeepAliveTime();
        case "maxpoolsize":
        case "maxPoolSize": return target.getMaxPoolSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getMaxQueueSize();
        case "poolsize":
        case "poolSize": return target.getPoolSize();
        case "rejectedpolicy":
        case "rejectedPolicy": return target.getRejectedPolicy();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "config": return org.apache.camel.main.ThreadPoolProfileConfigurationProperties.class;
        default: return null;
        }
    }
}

