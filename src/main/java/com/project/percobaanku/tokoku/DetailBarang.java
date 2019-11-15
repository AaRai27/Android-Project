package com.project.percobaanku.tokoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailBarang extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_DETAILS_MERK = "extra_details_merk";
    public static final String EXTRA_DETAILS_BERAT = "extra_details_berat";
    public static final String EXTRA_DETAILS_WARNA = "extra_details_warna";
    public static final String EXTRA_DETAILS_MEMORI = "extra_details_memori";
    public static final String EXTRA_PHOTO = "extra_photo";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);

        TextView tvItemName = findViewById(R.id.tv_item_name);
        TextView tvItemPrice = findViewById(R.id.tv_item_price);
        TextView tvItemDetailsMerk = findViewById(R.id.tv_item_detail_merk);
        TextView tvItemDetailsBerat = findViewById(R.id.tv_item_detail_berat);
        TextView tvItemDetailsWarna = findViewById(R.id.tv_item_detail_warna);
        TextView tvItemDetailsMemori = findViewById(R.id.tv_item_detail_memori);
        ImageView ivItemPhoto = findViewById(R.id.img_item_photo);
        Button penjual = findViewById(R.id.detailPenjual);
        penjual.setOnClickListener(this);

        String namaBarang = getIntent().getStringExtra(EXTRA_NAME);
        String hargaBarang = getIntent().getStringExtra(EXTRA_PRICE);
        String detailMerkBarang = getIntent().getStringExtra(EXTRA_DETAILS_MERK);
        String detailBeratBarang = getIntent().getStringExtra(EXTRA_DETAILS_BERAT);
        String detailWarnaBarang = getIntent().getStringExtra(EXTRA_DETAILS_WARNA);
        String detailMemoriBarang = getIntent().getStringExtra(EXTRA_DETAILS_MEMORI);
        int photoBarang = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        tvItemName.setText(namaBarang);
        tvItemPrice.setText(hargaBarang);
        tvItemDetailsMerk.setText(detailMerkBarang);
        tvItemDetailsBerat.setText(detailBeratBarang);
        tvItemDetailsWarna.setText(detailWarnaBarang);
        tvItemDetailsMemori.setText(detailMemoriBarang);

        Glide.with(this)
                .load(photoBarang)
                .into(ivItemPhoto);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.detailPenjual){
            Intent seePenjual = new Intent(DetailBarang.this, AboutMe.class);
            seePenjual.putExtra(AboutMe.EXTRA_NAME, "AFIF RAIHAN");
            seePenjual.putExtra(AboutMe.EXTRA_EMAIL, "setetesairlaut@gmail.com");
            startActivity(seePenjual);
        }
    }
}
