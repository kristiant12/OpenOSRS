/*
 * This file is generated by jOOQ.
 */
package net.runelite.client.database.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import net.runelite.client.database.data.Indexes;
import net.runelite.client.database.data.Keys;
import net.runelite.client.database.data.Public;
import net.runelite.client.database.data.tables.records.UserRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
		"jOOQ version:3.11.12"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class User extends TableImpl<UserRecord>
{

	private static final long serialVersionUID = 270848699;

	/**
	 * The reference instance of <code>PUBLIC.USER</code>
	 */
	public static final User USER = new User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserRecord> getRecordType()
	{
		return UserRecord.class;
	}

	/**
	 * The column <code>PUBLIC.USER.UNIQUEID</code>.
	 */
	public final TableField<UserRecord, UUID> UNIQUEID = createField("UNIQUEID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.USER.USERNAME</code>.
	 */
	public final TableField<UserRecord, String> USERNAME = createField("USERNAME", org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.USER</code> table reference
	 */
	public User()
	{
		this(DSL.name("USER"), null);
	}

	/**
	 * Create an aliased <code>PUBLIC.USER</code> table reference
	 */
	public User(String alias)
	{
		this(DSL.name(alias), USER);
	}

	/**
	 * Create an aliased <code>PUBLIC.USER</code> table reference
	 */
	public User(Name alias)
	{
		this(alias, USER);
	}

	private User(Name alias, Table<UserRecord> aliased)
	{
		this(alias, aliased, null);
	}

	private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters)
	{
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key)
	{
		super(child, key, USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema()
	{
		return Public.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes()
	{
		return Arrays.<Index>asList(Indexes.PRIMARY_KEY_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserRecord> getPrimaryKey()
	{
		return Keys.PK_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserRecord>> getKeys()
	{
		return Arrays.<UniqueKey<UserRecord>>asList(Keys.PK_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public User as(String alias)
	{
		return new User(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public User as(Name alias)
	{
		return new User(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public User rename(String name)
	{
		return new User(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public User rename(Name name)
	{
		return new User(name, null);
	}
}
