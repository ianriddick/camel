/**
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
package org.apache.camel.component.google.pubsub.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Messaging client for Google Cloud Platform PubSub Service
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-pubsub")
public class GooglePubsubComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-pubsub component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the connection factory to use: provides the ability to explicitly
     * manage connection credentials: - the path to the key file - the Service
     * Account Key / Email pair
     */
    private GooglePubsubConnectionFactoryNestedConfiguration connectionFactory;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public GooglePubsubConnectionFactoryNestedConfiguration getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(
            GooglePubsubConnectionFactoryNestedConfiguration connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class GooglePubsubConnectionFactoryNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory.class;
        private String credentialsFileLocation;
        private String serviceAccountKey;
        private String serviceAccount;
        private String serviceURL;

        public String getCredentialsFileLocation() {
            return credentialsFileLocation;
        }

        public void setCredentialsFileLocation(String credentialsFileLocation) {
            this.credentialsFileLocation = credentialsFileLocation;
        }

        public String getServiceAccountKey() {
            return serviceAccountKey;
        }

        public void setServiceAccountKey(String serviceAccountKey) {
            this.serviceAccountKey = serviceAccountKey;
        }

        public String getServiceAccount() {
            return serviceAccount;
        }

        public void setServiceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
        }

        public String getServiceURL() {
            return serviceURL;
        }

        public void setServiceURL(String serviceURL) {
            this.serviceURL = serviceURL;
        }
    }
}