package com.kontak.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Kontak> listDataKontak;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Kontak> getListDataKontak() {
        return listDataKontak;
    }

    public void setListDataKontak(List<Kontak> listDataKontak) {
        this.listDataKontak = listDataKontak;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
