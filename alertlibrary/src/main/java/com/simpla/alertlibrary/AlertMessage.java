package com.simpla.alertlibrary;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;

public class AlertMessage {

    public static void msg(Context c, String message, String title, String buttonMsg){
        AlertDialog ad = new AlertDialog.Builder(c).create();
        ad.setTitle(title);
        ad.setMessage(message);
        ad.setButton(AlertDialog.BUTTON_NEUTRAL, buttonMsg, (dialogInterface, i) -> ad.dismiss());
        ad.show();
    }
}
