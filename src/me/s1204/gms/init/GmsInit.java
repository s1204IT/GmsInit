package me.s1204.gms.init;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;

public class GmsInit {
    private static final String[] PERMS = {
            "android.permission.ACCESS_FINE_LOCATION",
            "android.permission.ACCESS_COARSE_LOCATION"
    };

    static void grant(Context ctx) {
        PackageManager pm = ctx.getPackageManager();
        for (String p : PERMS) {
            try {
                pm.grantRuntimePermission("com.google.android.gms", p, Process.myUserHandle());
            } catch (Throwable ignored) {
            }
        }
    }
}
