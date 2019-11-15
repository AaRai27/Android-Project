package com.project.percobaanku.tokoku.model;

public class Barang {
    private String name;
    private String detailMerk;
    private String detailBerat;
    private String detailWarna;
    private String detailMemori;
    private String price;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailMerk() {
        return detailMerk;
    }

    public String getDetailBerat() {
        return detailBerat;
    }

    public void setDetailBerat(String detailBerat) {
        this.detailBerat = detailBerat;
    }

    public String getDetailWarna() {
        return detailWarna;
    }

    public void setDetailWarna(String detailWarna) {
        this.detailWarna = detailWarna;
    }

    public String getDetailMemori() {
        return detailMemori;
    }

    public void setDetailMemori(String detailMemori) {
        this.detailMemori = detailMemori;
    }

    public void setDetailMerk (String detailMerk) {
        this.detailMerk = detailMerk;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
