package com.course.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.course.greendao.SHOPPING;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table SHOPPING.
*/
public class SHOPPINGDao extends AbstractDao<SHOPPING, Long> {

    public static final String TABLENAME = "SHOPPING";

    /**
     * Properties of entity SHOPPING.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Course_id = new Property(1, Integer.class, "course_id", false, "COURSE_ID");
        public final static Property User_id = new Property(2, Integer.class, "user_id", false, "USER_ID");
        public final static Property Addtime = new Property(3, java.util.Date.class, "addtime", false, "ADDTIME");
    };


    public SHOPPINGDao(DaoConfig config) {
        super(config);
    }
    
    public SHOPPINGDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SHOPPING' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'COURSE_ID' INTEGER," + // 1: course_id
                "'USER_ID' INTEGER," + // 2: user_id
                "'ADDTIME' INTEGER);"); // 3: addtime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SHOPPING'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, SHOPPING entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer course_id = entity.getCourse_id();
        if (course_id != null) {
            stmt.bindLong(2, course_id);
        }
 
        Integer user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(3, user_id);
        }
 
        java.util.Date addtime = entity.getAddtime();
        if (addtime != null) {
            stmt.bindLong(4, addtime.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public SHOPPING readEntity(Cursor cursor, int offset) {
        SHOPPING entity = new SHOPPING( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // course_id
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // user_id
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)) // addtime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, SHOPPING entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCourse_id(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setUser_id(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setAddtime(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(SHOPPING entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(SHOPPING entity) {
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