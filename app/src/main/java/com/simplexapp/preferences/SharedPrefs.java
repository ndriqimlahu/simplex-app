package com.simplexapp.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {
    public static String KEY_SHARED_PREFERENCES = "com.ndriqimlahu";

    public static SharedPreferences getPrefs(Context context){
        return context.getSharedPreferences(KEY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
    }

    // save String
    public static void saveString(Context context, String key, String value) {
        getPrefs(context).edit().putString(key,value).apply();
    }

    // get String
    public static String getString(Context context, String key) {
        return getPrefs(context).getString(key,"");
    }

    // save boolean
    public static void saveBoolean(Context context, String key, boolean value) {
        getPrefs(context).edit().putBoolean(key,value).apply();
    }

    // get boolean
    public static boolean getBoolean(Context context, String key) {
        return getPrefs(context).getBoolean(key,false);
    }

    // save double
    public static void saveDouble(Context context, String key, double value) {
        getPrefs(context).edit().putFloat(key,(float)value).apply();
    }

    // get double
    public static double getDouble(Context context, String key) {
        return getPrefs(context).getFloat(key,0);
    }
}