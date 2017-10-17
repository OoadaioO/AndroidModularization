package com.shuisechanggong.core_kernel;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * <pre>
 *     author : xb
 *     e-mail : xubo@idongjia.cn
 *     time   : 2017/10/16
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class RouterTrojanProvider extends ContentProvider {


    @Override
    public boolean onCreate() {

        Log.d("RouterTrojanProvider", "RouterTrojanProvider onCreate");
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
          ARouter.init((Application) getContext());

        return true;
    }


    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, String[] strings, String s, String[] strings1,
                        String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
