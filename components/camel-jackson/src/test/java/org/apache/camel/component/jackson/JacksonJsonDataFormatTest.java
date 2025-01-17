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
package org.apache.camel.component.jackson;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class JacksonJsonDataFormatTest extends JacksonMarshalTest {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // jackson is default for json
                from("direct:in").marshal().json();
                from("direct:back").unmarshal().json().to("mock:reverse");

                from("direct:inPretty").marshal().json(true);
                from("direct:backPretty").unmarshal().json().to("mock:reverse");

                from("direct:inPojo").marshal().json(JsonLibrary.Jackson);
                from("direct:backPojo").unmarshal().json(JsonLibrary.Jackson, TestPojo.class).to("mock:reversePojo");

                from("direct:nullBody").unmarshal().allowNullBody().json().to("mock:nullBody");
            }
        };
    }

}
