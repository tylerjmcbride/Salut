package com.peak.salut;

import android.app.Activity;
import android.content.Context;

import com.peak.salut.Callbacks.SalutDataCallback;

public class SalutDataReceiver {

    protected SalutDataCallback dataCallback;
    protected Context context;

    public SalutDataReceiver(Context context, SalutDataCallback dataCallback) {
        this.dataCallback = dataCallback;
        this.context = context;
    }
}
