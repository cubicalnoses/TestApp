package com.example.ccousins.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MYCONST = 589;
    private static final String LOG_TAG = "dongle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doThis();

    }

    private void doThis() {
        MyTextUtil textUtil = new MyTextUtil();
        textUtil.doSomethingElse();

        Intent intent = new Intent();

        Toast.makeText(this, "My message", Toast.LENGTH_SHORT).show();

        Log.i(LOG_TAG, "doThis: my message");

        TextView tv = findViewById(R.id.myTextView);
        tv.setText("Some text");
    }
}
