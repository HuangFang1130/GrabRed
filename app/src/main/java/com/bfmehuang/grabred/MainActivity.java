package com.bfmehuang.grabred;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar =  findViewById(R.id.toolbar);
        mToolbar.setNavigationOnClickListener(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mButton = findViewById(R.id.buttonPanel);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedPacketDialog redPacketDialog = new RedPacketDialog(MainActivity.this);
                redPacketDialog.show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case android.R.id.home:
                finish();
        }
    }

}
