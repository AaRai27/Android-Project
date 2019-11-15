package com.project.percobaanku.tokoku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.percobaanku.tokoku.model.Barang;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String title = "TokoKu";
    private RecyclerView rvBarang;
    private ArrayList<Barang> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        Button btnAboutMe = findViewById(R.id.btn_about);
        btnAboutMe.setOnClickListener(this);

        Button btnBelanja = findViewById(R.id.btn_belanja);
        btnBelanja.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutMe.class);
                aboutIntent.putExtra(AboutMe.EXTRA_NAME, "AFIF RAIHAN");
                aboutIntent.putExtra(AboutMe.EXTRA_EMAIL, "setetesairlaut@gmail.com");
                startActivity(aboutIntent);
                break;
            case R.id.btn_belanja:
                Intent belanjaIntent = new Intent(MainActivity.this, CardViewBarang.class);
                startActivity(belanjaIntent);
                break;
        }
    }

    private void setActionBarTitle(String title){
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

}
