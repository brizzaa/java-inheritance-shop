package com.inheritance.shop;
import java.util.Random;

public class Prodotto {

    private int codiceProdotto;
    Random random = new Random();

    private String nomeProdotto;
    private String marcaProdotto;
    private double prezzoProdotto;

    private int ivaProdotto = 22;


    public Prodotto(String nome, String marca, double prezzo, int iva){

        this.codiceProdotto = Math.abs(random.nextInt(100000));
        this.nomeProdotto = nome;
        this.marcaProdotto = marca;
        this.prezzoProdotto = prezzo;
        this.ivaProdotto = iva;
    }

    public Prodotto(String nome, String marca, double prezzo){

        this.codiceProdotto = Math.abs(random.nextInt(100000));
        this.nomeProdotto = nome;
        this.marcaProdotto = marca;
        this.prezzoProdotto = prezzo;

    }


    protected int getCodiceProdotto(){
        return this.codiceProdotto;
    }

    protected String getNomeProdotto(){
        return this.nomeProdotto;
    }

    protected String getMarcaProdotto(){
        return this.marcaProdotto;
    }

    protected double getPrezzoProdotto(){
        return this.prezzoProdotto;
    }

    protected double getIvaProdotto(){
        return this.ivaProdotto;
    }

    protected void setCodiceProdotto(int codice){
        this.codiceProdotto = codice;
    }

    protected void setNomeProdotto(String nome){
        this.nomeProdotto = nome;   
    }

    protected void setMarcaProdotto(String marca){
        this.marcaProdotto = marca;
    }

    protected void setPrezzoProdotto(double prezzo){
        this.prezzoProdotto = prezzo;
    }

    protected void setPrezzoProdotto(int iva){
        this.ivaProdotto = iva;
    }

}
