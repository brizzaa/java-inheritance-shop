package com.inheritance.shop;
// colore e se bluetooth

public class Cuffie extends Prodotto{

    private String coloreProdotto;
    private boolean bluetoothProdotto;

    public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean bluetooth){

        super(nome, marca, prezzo, iva);
        this.coloreProdotto = colore;
        this.bluetoothProdotto = bluetooth;

    }

    public Cuffie(String nome, String marca, double prezzo, String colore, boolean bluetooth){

        super(nome, marca, prezzo);
        this.coloreProdotto = colore;
        this.bluetoothProdotto = bluetooth;
        
    }

    public void setColoreProdotto(String colore){
        this.coloreProdotto = colore;
    }

    public void setBluetoothProdotto(boolean bluetooth){
        this.bluetoothProdotto = bluetooth;
    }

    public String getColoreProdotto(){
        return this.coloreProdotto;
    }

    public boolean getBluetoothProdotto(){
        return this.bluetoothProdotto;
    }

}