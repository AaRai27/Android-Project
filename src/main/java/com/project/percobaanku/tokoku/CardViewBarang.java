package com.project.percobaanku.tokoku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

//import com.project.percobaanku.tokoku.adapter.CardViewHeroAdapter;
//import com.project.percobaanku.tokoku.adapter.GridHeroAdapter;
import com.project.percobaanku.tokoku.adapter.CardViewBarangAdapter;
import com.project.percobaanku.tokoku.model.Barang;
import com.project.percobaanku.tokoku.model.DataBarang;

import java.util.ArrayList;

public class CardViewBarang extends AppCompatActivity{
    private RecyclerView rvBarang;
    private ArrayList<Barang> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rvBarang = findViewById(R.id.rv_barang);
        rvBarang.setHasFixedSize(true);

        list.addAll(DataBarang.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView(){
        rvBarang.setLayoutManager(new LinearLayoutManager(this));
        CardViewBarangAdapter cardViewBarangAdapter = new CardViewBarangAdapter(list);
        rvBarang.setAdapter(cardViewBarangAdapter);
        cardViewBarangAdapter.setOnItemClickCallback(new CardViewBarangAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Barang data) {
                showSelectedBarang(data);
                Intent seeDetails = new Intent(CardViewBarang.this, DetailBarang.class);
                seeDetails.putExtra(DetailBarang.EXTRA_NAME, data.getName());
                seeDetails.putExtra(DetailBarang.EXTRA_PRICE, data.getPrice());
                seeDetails.putExtra(DetailBarang.EXTRA_DETAILS_MERK, data.getDetailMerk());
                seeDetails.putExtra(DetailBarang.EXTRA_DETAILS_BERAT, data.getDetailBerat());
                seeDetails.putExtra(DetailBarang.EXTRA_DETAILS_WARNA, data.getDetailWarna());
                seeDetails.putExtra(DetailBarang.EXTRA_DETAILS_MEMORI, data.getDetailMemori());
                seeDetails.putExtra(DetailBarang.EXTRA_PHOTO,data.getPhoto());
                startActivity(seeDetails);
            }
        });
    }


    private void setActionBarTitle(String title){
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }


    private void showSelectedBarang(Barang barang){
        Toast.makeText(this, "See Details of " + barang.getName(), Toast.LENGTH_SHORT).show();
    }
}
