package com.example.demo.genericEvents;

public class Transaction {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;


    public Transaction(String id, String data){
        this.data = data;
        this.id = id;
    }

}
