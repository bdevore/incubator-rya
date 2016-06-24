package mvm.rya.hbase;

import mvm.rya.api.RdfCloudTripleStoreConfiguration;
import org.apache.hadoop.conf.Configuration;

/**
 * Created by 514189 on 6/24/2016.
 */
public class HBaseRdfConfiguration extends RdfCloudTripleStoreConfiguration {

    /**
     * Default constructor
     */
    public HBaseRdfConfiguration() {
        super();
    }

    /**
     * Populating constructor
     * @param other Configuration used to populate this configuration object
     */
    public HBaseRdfConfiguration(Configuration other) {
        super(other);
    }

    @Override
    public HBaseRdfConfiguration clone() {
        return new HBaseRdfConfiguration(this);
    }
}
