package com.course.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.course.greendao.ORDER;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ORDER.
*/
public class ORDERDao extends AbstractDao<ORDER, Long> {

    public static final String TABLENAME = "ORDER";

    /**
     * Properties of entity ORDER.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ordernumber = new Property(1, String.class, "ordernumber", false, "ORDERNUMBER");
        public final static Property Course_id = new Property(2, Integer.class, "course_id", false, "COURSE_ID");
        public final static Property User_id = new Property(3, Integer.class, "user_id", false, "USER_ID");
        public final static Property Addtime = new Property(4, java.util.Date.class, "addtime", false, "ADDTIME");
    };


    public ORDERDao(DaoConfig config) {
        super(config);
    }
    
    public ORDERDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ORDER' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'ORDERNUMBER' TEXT," + // 1: ordernumber
                "'COURSE_ID' INTEGER," + // 2: course_id
                "'USER_ID' INTEGER," + // 3: user_id
                "'ADDTIME' INTEGER);"); // 4: addtime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ORDER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ORDER entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ordernumber = entity.getOrdernumber();
        if (ordernumber != null) {
            stmt.bindString(2, ordernumber);
        }
 
        Integer course_id = entity.getCourse_id();
        if (course_id != null) {
            stmt.bindLong(3, course_id);
        }
 
        Integer user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(4, user_id);
        }
 
        java.util.Date addtime = entity.getAddtime();
        if (addtime != null) {
            stmt.bindLong(5, addtime.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ORDER readEntity(Cursor cursor, int offset) {
        ORDER entity = new ORDER( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ordernumber
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // course_id
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // user_id
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)) // addtime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ORDER entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setOrdernumber(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCourse_id(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setUser_id(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setAddtime(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ORDER entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ORDER entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
