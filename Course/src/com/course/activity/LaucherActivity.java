package com.course.activity;

import com.course.R;
import com.course.greendao.DaoMaster;
import com.course.greendao.DaoMaster.DevOpenHelper;
import com.course.greendao.DaoSession;
import android.annotation.TargetApi;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.view.Window;
import android.view.WindowManager;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class LaucherActivity extends Activity {

	private SQLiteDatabase db;
	private DaoMaster daoMaster;
	private DaoSession daoSession;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (VERSION.SDK_INT >= VERSION_CODES.KITKAT) {
			// transparent status
			getWindow().addFlags(
					WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			// transparent navigation
			getWindow().addFlags(
					WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
		}
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_laucher);
		DevOpenHelper myHelper = new DevOpenHelper(LaucherActivity.this,
				"course.db", null);
		db = myHelper.getWritableDatabase();
		daoMaster = new DaoMaster(db);
		daoSession = daoMaster.newSession();
	}

}
