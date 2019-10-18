package com.example.a34_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_CODE ="extra_syntax";
    public static final String EXTRA_LINK ="extra_link";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Nama = findViewById(R.id.komponenname);
        TextView Detail = findViewById(R.id.komponendeskripsi);
        TextView Syntax = findViewById(R.id.komponenecode);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String code = getIntent().getStringExtra(EXTRA_CODE);

        final String link = getIntent().getStringExtra(EXTRA_LINK);

        Nama.setText(name);
        Detail.setText(detail);
        Syntax.setText(code);

        findViewById(R.id.more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clikLink(link);
            }
        });
    }
    public void clikLink(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}