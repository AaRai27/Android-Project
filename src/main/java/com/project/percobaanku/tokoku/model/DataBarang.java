package com.project.percobaanku.tokoku.model;

import com.project.percobaanku.tokoku.R;

import java.util.ArrayList;


public class DataBarang {

    String[] mNb;


    public DataBarang() {
        this.mNb = namaBarang;
    }

    private static String[] namaBarang = {
            "HandphoneKu",
            "LaptopKu",
            "MouseKu",
            "PowerBankKu",
            "SepatuKu",
            "SendalKu",
            "KipasKu",
            "Mejaku",
            "MobilKu",
            "MotorKu",
            "SepedaKu"
    };

    private static String[] detailMerkBarang = {
            "Xiaomi MI A1",
            "Lenovo IdeaPad C340",
            "Logitech M56",
            "Vivan PB",
            "New Balance 123",
            "Swallow List",
            "Krisbow Air Monster",
            "Wood Table",
            "BMW XXD",
            "Kawasaki Ninja 250",
            "Dahon Mount Bike"
    };

    private static String[] detailBeratBarang = {
            "0.8 Kg.",
            "2.3 Kg",
            "0.1 Kg",
            "0.7 Kg",
            "0.6 Kg",
            "0.1 Kg",
            "1.2 Kg",
            "8.3 Kg",
            "700 kg",
            "100 kg",
            "4.6 Kg"
    };

    private static String[] detailWarnaBarang = {
            "Dove Gold",
            "Dove Gray",
            "Black Gray",
            "White",
            "Black",
            "Black List Green",
            "Black",
            "Brown Wood Texture",
            "Metalic Grey",
            "Black Green",
            "Black"
    };

    private static String[] detailMemoriBarang = {
            "4+64G\n4GB RAM\n64GB memori internal\nMemori eksternal sampai dengan 128GB (microSD)",
            "8GB RAM\n512 SSD SATA",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-"
    };

    private static int[] gambarBarang = {
            R.drawable.mia1,
            R.drawable.lenovo,
            R.drawable.mouse,
            R.drawable.pbvivan,
            R.drawable.nbseaptu,
            R.drawable.sendal,
            R.drawable.kipas,
            R.drawable.meja,
            R.drawable.bmw,
            R.drawable.ninja,
            R.drawable.dahon
    };

    private static String[] hargaBarang = {
            "Rp. 2.000.000",
            "Rp. 11.000.000",
            "Rp. 100.000",
            "Rp. 269.000",
            "Rp. 1.100.000",
            "Rp. 15.000",
            "Rp. 399.000",
            "Rp. 1.400.000",
            "Rp. 1.400.000.000",
            "Rp. 67.500.000",
            "Rp. 5.300.000"
    };

    public static ArrayList<Barang> getListData() {
        ArrayList<Barang> list = new ArrayList<>();
        for (int position = 0; position < namaBarang.length; position++) {
            Barang barang = new Barang();
            barang.setName(namaBarang[position]);
            barang.setDetailMerk(detailMerkBarang[position]);
            barang.setDetailBerat(detailBeratBarang[position]);
            barang.setDetailWarna(detailWarnaBarang[position]);
            barang.setDetailMemori(detailMemoriBarang[position]);
            barang.setPhoto(gambarBarang[position]);
            barang.setPrice(hargaBarang[position]);
            list.add(barang);
        }
        return list;
    }

}
