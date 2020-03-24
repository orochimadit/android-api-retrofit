package com.example.kontakapi.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String result;
    Kontak mKontak;
    @SerializedName("message")
    String message;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Kontak getKontak() {
        return mKontak;
    }

    public void setKontak(Kontak mKontak) {
        this.mKontak = mKontak;
    }
}
