package br.com.fiap.a2tina_android_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class MeuBroadcast extends BroadcastReceiver {
    public MeuBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
