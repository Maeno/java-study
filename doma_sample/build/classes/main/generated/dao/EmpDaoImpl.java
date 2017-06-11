package dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2017-06-12T01:19:15.127+0900")
public class EmpDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements dao.EmpDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(dao.EmpDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(dao.EmpDao.class, "insert", entity.EmpEntity.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(dao.EmpDao.class, "batchInsert", java.util.List.class);

    /** */
    public EmpDaoImpl() {
        super(config.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public EmpDaoImpl(java.sql.Connection connection) {
        super(config.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmpDaoImpl(javax.sql.DataSource dataSource) {
        super(config.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<entity.EmpEntity> selectAll() {
        entering("dao.EmpDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/dao/EmpDao/selectAll.sql");
            __query.setEntityType(entity._EmpEntity.getSingletonInternal());
            __query.setCallerClassName("dao.EmpDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<entity.EmpEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<entity.EmpEntity>(entity._EmpEntity.getSingletonInternal()));
            java.util.List<entity.EmpEntity> __result = __command.execute();
            __query.complete();
            exiting("dao.EmpDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("dao.EmpDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int insert(entity.EmpEntity empEntity) {
        entering("dao.EmpDaoImpl", "insert", empEntity);
        try {
            if (empEntity == null) {
                throw new org.seasar.doma.DomaNullPointerException("empEntity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<entity.EmpEntity> __query = getQueryImplementors().createAutoInsertQuery(__method1, entity._EmpEntity.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(empEntity);
            __query.setCallerClassName("dao.EmpDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("dao.EmpDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("dao.EmpDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchInsert(java.util.List<entity.EmpEntity> entities) {
        entering("dao.EmpDaoImpl", "batchInsert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<entity.EmpEntity> __query = getQueryImplementors().createAutoBatchInsertQuery(__method2, entity._EmpEntity.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("dao.EmpDaoImpl");
            __query.setCallerMethodName("batchInsert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method2, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("dao.EmpDaoImpl", "batchInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("dao.EmpDaoImpl", "batchInsert", __e);
            throw __e;
        }
    }

}
