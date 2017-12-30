/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.AliasRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Alias extends TableImpl<AliasRecord> {

    private static final long serialVersionUID = 1395883121;

    /**
     * The reference instance of <code>DB.alias</code>
     */
    public static final Alias ALIAS = new Alias();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AliasRecord> getRecordType() {
        return AliasRecord.class;
    }

    /**
     * The column <code>DB.alias.db_id</code>.
     */
    public final TableField<AliasRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.alias.id</code>.
     */
    public final TableField<AliasRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.alias.account_id</code>.
     */
    public final TableField<AliasRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.alias.alias_name</code>.
     */
    public final TableField<AliasRecord, String> ALIAS_NAME = createField("alias_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>DB.alias.alias_name_LOWER</code>.
     */
    public final TableField<AliasRecord, String> ALIAS_NAME_LOWER = createField("alias_name_LOWER", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>DB.alias.alias_uri</code>.
     */
    public final TableField<AliasRecord, String> ALIAS_URI = createField("alias_uri", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>DB.alias.timestamp</code>.
     */
    public final TableField<AliasRecord, Integer> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.alias.height</code>.
     */
    public final TableField<AliasRecord, Integer> HEIGHT = createField("height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.alias.latest</code>.
     */
    public final TableField<AliasRecord, Boolean> LATEST = createField("latest", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>DB.alias</code> table reference
     */
    public Alias() {
        this(DSL.name("alias"), null);
    }

    /**
     * Create an aliased <code>DB.alias</code> table reference
     */
    public Alias(String alias) {
        this(DSL.name(alias), ALIAS);
    }

    /**
     * Create an aliased <code>DB.alias</code> table reference
     */
    public Alias(Name alias) {
        this(alias, ALIAS);
    }

    private Alias(Name alias, Table<AliasRecord> aliased) {
        this(alias, aliased, null);
    }

    private Alias(Name alias, Table<AliasRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ALIAS_ALIAS_ACCOUNT_ID_IDX, Indexes.ALIAS_ALIAS_ID_HEIGHT_IDX, Indexes.ALIAS_ALIAS_NAME_LOWER_IDX, Indexes.ALIAS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AliasRecord, Long> getIdentity() {
        return Keys.IDENTITY_ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AliasRecord> getPrimaryKey() {
        return Keys.KEY_ALIAS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AliasRecord>> getKeys() {
        return Arrays.<UniqueKey<AliasRecord>>asList(Keys.KEY_ALIAS_PRIMARY, Keys.KEY_ALIAS_ALIAS_ID_HEIGHT_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Alias as(String alias) {
        return new Alias(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Alias as(Name alias) {
        return new Alias(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Alias rename(String name) {
        return new Alias(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Alias rename(Name name) {
        return new Alias(name, null);
    }
}
