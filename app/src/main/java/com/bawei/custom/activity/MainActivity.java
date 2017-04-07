package com.bawei.custom.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.custom.R;
import com.bawei.custom.view.CustomView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomView customView = new CustomView(this);
        setContentView(customView);
    }
}
