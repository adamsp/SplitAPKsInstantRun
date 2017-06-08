package com.example.aspeakman.splitapksinstantrun;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            ((TextView) findViewById(R.id.version_code)).setText(Integer.toString(getPackageManager().getPackageInfo(getPackageName(), 0).versionCode));
        }
        catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
