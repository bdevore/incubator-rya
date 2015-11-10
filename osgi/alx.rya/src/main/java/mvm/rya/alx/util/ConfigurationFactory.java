package mvm.rya.alx.util;

/*
 * #%L
 * mvm.rya.alx.rya
 * %%
 * Copyright (C) 2014 Rya
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import mvm.rya.accumulo.AccumuloRdfConfiguration;
import mvm.rya.api.RdfCloudTripleStoreConfiguration;
import org.apache.hadoop.conf.Configuration;

import java.util.Map;

/**
 */
public class ConfigurationFactory {
    private Map<String, String> properties;

    public RdfCloudTripleStoreConfiguration getConfiguration() {
        RdfCloudTripleStoreConfiguration conf = new AccumuloRdfConfiguration();
        if (properties != null) {
            for (Map.Entry<String, String> prop : properties.entrySet()) {
                conf.set(prop.getKey(), prop.getValue());
            }
            conf.setTablePrefix(conf.getTablePrefix());
        }
        return conf;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}