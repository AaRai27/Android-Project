package com.project.percobaanku.tokoku.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.project.percobaanku.tokoku.R;
import com.project.percobaanku.tokoku.model.Barang;

import java.util.ArrayList;

public class CardViewBarangAdapter extends RecyclerView.Adapter<CardViewBarangAdapter.CardViewViewHolder> {
    private ArrayList<Barang> listBarang;
    private OnItemClickCallback onItemClickCallback;

    public CardViewBarangAdapter(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }



    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_barang,viewGroup,false);
        return  new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        Barang barang = listBarang.get(position);

        Glide.with(holder.itemView.getContext())
                .load(barang.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
        holder.tvName.setText(barang.getName());
        holder.tvDetailMerk.setText(barang.getDetailMerk());
        holder.tvDetailBerat.setText(barang.getDetailBerat());
        holder.tvDetailWarna.setText(barang.getDetailWarna());
        holder.tvDetailMemori.setText(barang.getDetailMemori());
        holder.tvPrice.setText(barang.getPrice());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Add " + listBarang.get(holder.getAdapterPosition()).getName() + " to Favorite "
                        , Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBarang.get(holder.getAdapterPosition()));

            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listBarang.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetailMerk,tvDetailBerat,tvDetailWarna,tvDetailMemori, tvPrice;
        Button btnFavorite, btnDetails;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvDetailMerk = itemView.findViewById(R.id.tv_item_detail_merk);
            tvDetailBerat = itemView.findViewById(R.id.tv_item_detail_berat);
            tvDetailWarna = itemView.findViewById(R.id.tv_item_detail_warna);
            tvDetailMemori = itemView.findViewById(R.id.tv_item_detail_memori);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnDetails = itemView.findViewById(R.id.btn_set_details);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Barang data);
    }
}
