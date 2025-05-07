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


    public int getCodiceProdotto(){
        return this.codiceProdotto;
    }

    public String getNomeProdotto(){
        return this.nomeProdotto;
    }

    public String getMarcaProdotto(){
        return this.marcaProdotto;
    }

    public double getPrezzoProdotto(){
        return this.prezzoProdotto;
    }

    public double getIvaProdotto(){
        return this.ivaProdotto;
    }

    public void setCodiceProdotto(int codice){
        this.codiceProdotto = codice;
    }

    public void setNomeProdotto(String nome){
        this.nomeProdotto = nome;   
    }

    public void setMarcaProdotto(String marca){
        this.marcaProdotto = marca;
    }

    public void setPrezzoProdotto(double prezzo){
        this.prezzoProdotto = prezzo;
    }

    public void setPrezzoProdotto(int iva){
        this.ivaProdotto = iva;
    }

}
