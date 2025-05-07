package com.inheritance.shop;


public class Televisione extends Prodotto{

    private double dimensioniProdotto;
    private boolean smartProdotto;


    public Televisione(String nome, String marca, double prezzo, int iva, double dimensioni, boolean smart ){

        this.smartProdotto = smart;
        this.dimensioniProdotto = dimensioni;
        super(nome, marca, prezzo, iva);

    }

    public Televisione(String nome, String marca, double prezzo, double dimensioni, boolean smart ){

        this.smartProdotto = smart;
        this.dimensioniProdotto = dimensioni;
        super(nome, marca, prezzo);

    }

    public void setSmartProdotto(boolean smart){
        this.smartProdotto = smart;
    }

    public void setDimensioni(double dimensioni){
        this.dimensioniProdotto = dimensioni;
    }

    public boolean getSmartProdotto(){
        return this.smartProdotto;
    }

    public double getDimensioniProdotto(){
        return this.dimensioniProdotto;
    }


}
