package me.s1204.gms.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) return;
        GmsInit.grant(context);
        context.getPackageManager().setApplicationEnabledSetting(
                context.getPackageName(),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, 0);
    }
}
