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


    protected int getImeiProdotto(){
        return this.imeiProdotto;
    }

    protected int getGigabytesProdotto(){
        return this.gigabyteProdotto;
    }

    protected void setImeiProdotto(int imei){
        this.imeiProdotto = imei;
    }

    protected void getGigabytesProdotto(int gigabytes){
        this.gigabyteProdotto = gigabytes;
    }
    

}
