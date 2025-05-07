package com.inheritance.shop;



public class Smartphone extends Prodotto{

    // IMEI & memoria;
    private int imeiProdotto;
    private int gigabyteProdotto;

    public Smartphone(String nome, String marca, double prezzo, int imei, int gigabytes) {

        this.gigabyteProdotto = gigabytes;
        this.imeiProdotto = imei;
        super(nome, marca, prezzo);
        
    }

    public Smartphone(String nome, String marca, double prezzo, int iva, int imei, int gigabytes) {

        this.gigabyteProdotto = gigabytes;
        this.imeiProdotto = imei;
        super(nome, marca, prezzo, iva);

    }


    public int getImeiProdotto(){
        return this.imeiProdotto;
    }

    public int getGigabytesProdotto(){
        return this.gigabyteProdotto;
    }

    public void setImeiProdotto(int imei){
        this.imeiProdotto = imei;
    }

    public void getGigabytesProdotto(int gigabytes){
        this.gigabyteProdotto = gigabytes;
    }
    

}
