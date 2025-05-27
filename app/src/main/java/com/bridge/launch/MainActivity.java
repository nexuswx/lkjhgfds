package com.bridge.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.rallyservicetimer");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
        finish();
    }
}
