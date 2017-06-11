package entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2017-06-12T01:19:11.746+0900")
public final class _EmpEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<entity.EmpEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _EmpEntity __singleton = new _EmpEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("EMP_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, entity.EmpEntity, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(entity.EmpEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the empno */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, entity.EmpEntity, java.lang.Integer, Object> $empno = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(entity.EmpEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "empno", "", __namingType, true, true, false);

    /** the ename */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, entity.EmpEntity, java.lang.String, Object> $ename = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(entity.EmpEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "ename", "", __namingType, true, true, false);

    /** the deptno */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, entity.EmpEntity, java.lang.Integer, Object> $deptno = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(entity.EmpEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "deptno", "", __namingType, true, true, false);

    /** the dname */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, entity.EmpEntity, java.lang.String, Object> $dname = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(entity.EmpEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "dname", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<entity.EmpEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __entityPropertyTypeMap;

    private _EmpEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "EmpEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "EMP";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($empno);
        __map.put("empno", $empno);
        __list.add($ename);
        __map.put("ename", $ename);
        __list.add($deptno);
        __map.put("deptno", $deptno);
        __list.add($dname);
        __map.put("dname", $dname);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(entity.EmpEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<entity.EmpEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<entity.EmpEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, entity.EmpEntity, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, entity.EmpEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public entity.EmpEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<entity.EmpEntity, ?>> __args) {
        entity.EmpEntity entity = new entity.EmpEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("empno") != null) __args.get("empno").save(entity);
        if (__args.get("ename") != null) __args.get("ename").save(entity);
        if (__args.get("deptno") != null) __args.get("deptno").save(entity);
        if (__args.get("dname") != null) __args.get("dname").save(entity);
        return entity;
    }

    @Override
    public Class<entity.EmpEntity> getEntityClass() {
        return entity.EmpEntity.class;
    }

    @Override
    public entity.EmpEntity getOriginalStates(entity.EmpEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(entity.EmpEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EmpEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EmpEntity newInstance() {
        return new _EmpEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<entity.EmpEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
