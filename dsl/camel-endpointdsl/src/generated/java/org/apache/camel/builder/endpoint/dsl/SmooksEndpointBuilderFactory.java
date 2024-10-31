/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Use Smooks to transform, route, and bind both XML and non-XML data, including
 * EDI, CSV, JSON, and YAML.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SmooksEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Smooks component.
     */
    public interface SmooksEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSmooksEndpointBuilder advanced() {
            return (AdvancedSmooksEndpointBuilder) this;
        }

        /**
         * File path to place the generated HTML execution report. The report is
         * a useful tool in the developers arsenal for diagnosing issues or
         * comprehending a transformation. Do not set in production since this
         * is a major performance drain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param reportPath the value to set
         * @return the dsl builder
         */
        default SmooksEndpointBuilder reportPath(String reportPath) {
            doSetProperty("reportPath", reportPath);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Smooks component.
     */
    public interface AdvancedSmooksEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SmooksEndpointBuilder basic() {
            return (SmooksEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSmooksEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSmooksEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SmooksBuilders {
        /**
         * Smooks (camel-smooks)
         * Use Smooks to transform, route, and bind both XML and non-XML data,
         * including EDI, CSV, JSON, and YAML.
         * 
         * Category: transformation
         * Since: 4.7
         * Maven coordinates: org.apache.camel:camel-smooks
         * 
         * @return the dsl builder for the headers' name.
         */
        default SmooksHeaderNameBuilder smooks() {
            return SmooksHeaderNameBuilder.INSTANCE;
        }
        /**
         * Smooks (camel-smooks)
         * Use Smooks to transform, route, and bind both XML and non-XML data,
         * including EDI, CSV, JSON, and YAML.
         * 
         * Category: transformation
         * Since: 4.7
         * Maven coordinates: org.apache.camel:camel-smooks
         * 
         * Syntax: <code>smooks:smooksConfig</code>
         * 
         * Path parameter: smooksConfig (required)
         * Path to the Smooks configuration file
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param path smooksConfig
         * @return the dsl builder
         */
        default SmooksEndpointBuilder smooks(String path) {
            return SmooksEndpointBuilderFactory.endpointBuilder("smooks", path);
        }
        /**
         * Smooks (camel-smooks)
         * Use Smooks to transform, route, and bind both XML and non-XML data,
         * including EDI, CSV, JSON, and YAML.
         * 
         * Category: transformation
         * Since: 4.7
         * Maven coordinates: org.apache.camel:camel-smooks
         * 
         * Syntax: <code>smooks:smooksConfig</code>
         * 
         * Path parameter: smooksConfig (required)
         * Path to the Smooks configuration file
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path smooksConfig
         * @return the dsl builder
         */
        default SmooksEndpointBuilder smooks(String componentName, String path) {
            return SmooksEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Smooks component.
     */
    public static class SmooksHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SmooksHeaderNameBuilder INSTANCE = new SmooksHeaderNameBuilder();

        /**
         * The Smooks execution context.
         * 
         * The option is a: {@code org.smooks.api.ExecutionContext} type.
         * 
         * Group: advanced
         * 
         * @return the name of the header {@code SmooksExecutionContext}.
         */
        public String smooksExecutionContext() {
            return "CamelSmooksExecutionContext";
        }
    }
    static SmooksEndpointBuilder endpointBuilder(String componentName, String path) {
        class SmooksEndpointBuilderImpl extends AbstractEndpointBuilder implements SmooksEndpointBuilder, AdvancedSmooksEndpointBuilder {
            public SmooksEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SmooksEndpointBuilderImpl(path);
    }
}