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
package org.apache.camel.component.file;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class FileMarkerFileRecursiveDoNotDeleteOldLockFilesTest extends ContextTestSupport {

    @Test
    public void testDeleteOldLockOnStartup() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("New World");

        template.sendBodyAndHeader(fileUri(), "locked", Exchange.FILE_NAME,
                "hello.txt" + FileComponent.DEFAULT_LOCK_FILE_POSTFIX);
        template.sendBodyAndHeader(fileUri(), "Hello World", Exchange.FILE_NAME, "hello.txt");
        template.sendBodyAndHeader(fileUri("foo"), "locked", Exchange.FILE_NAME,
                "gooday.txt" + FileComponent.DEFAULT_LOCK_FILE_POSTFIX);
        template.sendBodyAndHeader(fileUri("foo"), "Goodday World", Exchange.FILE_NAME, "gooday.txt");
        // and a new file that has no lock
        template.sendBodyAndHeader(fileUri(), "New World", Exchange.FILE_NAME, "new.txt");

        // start the route
        context.getRouteController().startRoute("foo");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from(fileUri("?initialDelay=0&delay=10&readLock=markerFile&readLockDeleteOrphanLockFiles=false&recursive=true"))
                        .routeId("foo").autoStartup(false)
                        .convertBodyTo(String.class).to("log:result", "mock:result");
            }
        };
    }
}
