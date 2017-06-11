package dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2017-06-12T01:19:11.825+0900")
public class InitDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements dao.InitDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(dao.InitDao.class, "create");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(dao.InitDao.class, "drop");

    /** */
    public InitDaoImpl() {
        super(config.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public InitDaoImpl(java.sql.Connection connection) {
        super(config.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public InitDaoImpl(javax.sql.DataSource dataSource) {
        super(config.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected InitDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected InitDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected InitDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public void create() {
        entering("dao.InitDaoImpl", "create");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/dao/InitDao/create.script");
            __query.setCallerClassName("dao.InitDaoImpl");
            __query.setCallerMethodName("create");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method0, __query);
            __command.execute();
            __query.complete();
            exiting("dao.InitDaoImpl", "create", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("dao.InitDaoImpl", "create", __e);
            throw __e;
        }
    }

    @Override
    public void drop() {
        entering("dao.InitDaoImpl", "drop");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/dao/InitDao/drop.script");
            __query.setCallerClassName("dao.InitDaoImpl");
            __query.setCallerMethodName("drop");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method1, __query);
            __command.execute();
            __query.complete();
            exiting("dao.InitDaoImpl", "drop", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("dao.InitDaoImpl", "drop", __e);
            throw __e;
        }
    }

}
