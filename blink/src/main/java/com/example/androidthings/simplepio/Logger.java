package com.example.androidthings.simplepio;

import android.util.Log;

public class Logger {

    private static Boolean isLoggingEnabledInBuildConfig;

    public static void d(String tag, String message) {
        if (isLoggingEnabled()) {
            Log.d(tag, message);
        }
    }

    public static void d(String tag, String message, Object[] array) {
        if (isLoggingEnabled()) {
            Log.d(tag, message + arrayToString(array));
        }
    }

    public static void e(String tag, String message) {
        if (isLoggingEnabled()) {
            Log.e(tag, message);
        }
    }

    public static void e(String tag, String message, Throwable throwable) {
        if (isLoggingEnabled()) {
            Log.e(tag, message, throwable);
        }
    }

    public static void v(String tag, String message) {
        if (isLoggingEnabled()) {
            Log.v(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (isLoggingEnabled()) {
            Log.i(tag, message);
        }
    }

    private static String arrayToString(Object[] objects) {
        String string = "";
        for (Object object : objects) {
            string += " " + object;
        }
        return string;
    }


    /**
     * {@link BuildConfig#HYPERBANK_LOGGING_ENABLED} </p>
     * <p>
     *
     * @return {@code true} if this is a build has allowed logging, {@code false} if not.
     */
    public static boolean isLoggingEnabled() {
        isLoggingEnabledInBuildConfig = true;
        //TODO:
//        if (isLoggingEnabledInBuildConfig == null) {
//            try {
//                final Class<?> activityThread = Class.forName("android.app.ActivityThread");
//                final Method currentPackage = activityThread.getMethod("currentPackageName");
//                String packageName = (String) currentPackage.invoke(null, (Object[]) null);
//
//                //workaround for renaming package with build types, somehow BuildConfig's package is not renamed
//                if (packageName.endsWith(".debug") || packageName.endsWith(".prerelease")) {
//                    packageName = packageName.substring(0, packageName.lastIndexOf('.'));
//                }
//
//                final Class<?> buildConfig = Class.forName(packageName + ".BuildConfig");
//                final Field DEBUG = buildConfig.getField("HYPERBANK_LOGGING_ENABLED");
//                DEBUG.setAccessible(true);
//                isLoggingEnabledInBuildConfig = DEBUG.getBoolean(null);
//            } catch (final Throwable t) {
//                isLoggingEnabledInBuildConfig = false;
//            }
//        }
        return isLoggingEnabledInBuildConfig;
    }
}