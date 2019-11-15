package com.project.percobaanku.tokoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {
    private String title = "About Me";
    public static final String EXTRA_NAME = "extra_age";
    public static final String EXTRA_EMAIL = "extra_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        getSupportActionBar().setTitle(title);

        TextView tvNamaReceived = findViewById(R.id.tv_received_nama);
        TextView tvEmailReceived = findViewById(R.id.tv_received_email);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        String textName = name;
        String textEmail = email;

        tvNamaReceived.setText(textName);
        tvEmailReceived.setText(textEmail);
    }
}
