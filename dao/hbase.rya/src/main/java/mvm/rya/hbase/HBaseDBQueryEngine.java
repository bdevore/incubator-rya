package mvm.rya.hbase;

import info.aduna.iteration.CloseableIteration;
import mvm.rya.api.domain.RyaStatement;
import mvm.rya.api.persist.RyaDAOException;
import mvm.rya.api.persist.query.BatchRyaQuery;
import mvm.rya.api.persist.query.RyaQuery;
import mvm.rya.api.persist.query.RyaQueryEngine;
import org.calrissian.mango.collect.CloseableIterable;
import org.openrdf.query.BindingSet;

import java.util.Collection;
import java.util.Map;

/**
 * Created by 514189 on 6/24/2016.
 */
public class HBaseDBQueryEngine implements RyaQueryEngine<HBaseRdfConfiguration>{
    private HBaseRdfConfiguration conf;

    /**
     * Constructor with configuration
     * @param conf The configuration
     */
    public HBaseDBQueryEngine(HBaseRdfConfiguration conf) {
        this.conf = conf;
    }

    @Override
    public CloseableIteration<RyaStatement, RyaDAOException> query(RyaStatement stmt, HBaseRdfConfiguration conf) throws RyaDAOException {
        return null;
    }

    @Override
    public CloseableIteration<? extends Map.Entry<RyaStatement, BindingSet>, RyaDAOException> queryWithBindingSet(Collection<Map.Entry<RyaStatement, BindingSet>> stmts, HBaseRdfConfiguration conf) throws RyaDAOException {
        return null;
    }

    @Override
    public CloseableIteration<RyaStatement, RyaDAOException> batchQuery(Collection<RyaStatement> stmts, HBaseRdfConfiguration conf) throws RyaDAOException {
        return null;
    }

    @Override
    public CloseableIterable<RyaStatement> query(RyaQuery ryaQuery) throws RyaDAOException {
        return null;
    }

    @Override
    public CloseableIterable<RyaStatement> query(BatchRyaQuery batchRyaQuery) throws RyaDAOException {
        return null;
    }

    @Override
    public void setConf(HBaseRdfConfiguration conf) {

    }

    @Override
    public HBaseRdfConfiguration getConf() {
        return null;
    }
}
