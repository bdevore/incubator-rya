package mvm.rya.hbase;

import mvm.rya.api.RdfCloudTripleStoreConfiguration;
import mvm.rya.api.domain.RyaStatement;
import mvm.rya.api.domain.RyaURI;
import mvm.rya.api.persist.RyaDAO;
import mvm.rya.api.persist.RyaDAOException;
import mvm.rya.api.persist.RyaNamespaceManager;
import mvm.rya.api.persist.query.RyaQueryEngine;

import java.util.Iterator;

/**
 * Created by 514189 on 6/24/2016.
 */
public class HBaseDBRyaDAO implements RyaDAO<HBaseRdfConfiguration> {
    private HBaseRdfConfiguration conf = new HBaseRdfConfiguration();
    private HBaseDBQueryEngine queryEngine;

    private boolean initialized = false;


    /**
     * Constructor with configuration
     * @param conf The HBaseRdfConfiguration
     */
    public HBaseDBRyaDAO(HBaseRdfConfiguration conf) throws RyaDAOException {
        this.conf = conf;
        init();
    }

    @Override
    public void init() throws RyaDAOException {
        if (initialized) {
            return;
        }
    }

    @Override
    public boolean isInitialized() throws RyaDAOException {
        return initialized;
    }

    @Override
    public void destroy() throws RyaDAOException {

    }

    @Override
    public void add(RyaStatement statement) throws RyaDAOException {

    }

    @Override
    public void add(Iterator<RyaStatement> statement) throws RyaDAOException {

    }

    @Override
    public void delete(RyaStatement statement, HBaseRdfConfiguration conf) throws RyaDAOException {

    }

    @Override
    public void dropGraph(HBaseRdfConfiguration conf, RyaURI... graphs) throws RyaDAOException {

    }

    @Override
    public void delete(Iterator<RyaStatement> statements, HBaseRdfConfiguration conf) throws RyaDAOException {

    }

    @Override
    public String getVersion() throws RyaDAOException {
        return null;
    }

    @Override
    public RyaQueryEngine<HBaseRdfConfiguration> getQueryEngine() {
        return null;
    }

    @Override
    public RyaNamespaceManager<HBaseRdfConfiguration> getNamespaceManager() {
        return null;
    }

    @Override
    public void purge(RdfCloudTripleStoreConfiguration configuration) {

    }

    @Override
    public void dropAndDestroy() throws RyaDAOException {

    }

    @Override
    public void setConf(HBaseRdfConfiguration conf) {
        this.conf = conf;
    }

    @Override
    public HBaseRdfConfiguration getConf() {
        return conf;
    }

    /**
     * Set query engine
     * @param queryEngine The query engine
     */
    public void setQueryEngine(HBaseDBQueryEngine queryEngine) {
        this.queryEngine = queryEngine;
    }
}
