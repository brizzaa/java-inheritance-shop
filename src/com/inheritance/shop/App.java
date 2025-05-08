package com.inheritance.shop;

public class App {
    public static void main(String[] args) {
        
        Televisione uno = new Televisione("logitech 21", "logitech", 420, 210, false);
        Televisione due = new Televisione("logitech smart", "logitech", 40, 320, true);
        Smartphone iphoneZ = new Smartphone("IPHONE Z", "appl", 299, 130987412, 28);
        Cuffie logitechG402 = new Cuffie("cuffiozze LOGITECH", "logitech", 90, "Blu cielo", true);

        System.out.println(iphoneZ.getCodiceProdotto());
        System.out.println(due.getCodiceProdotto());
        System.out.println(uno.getCodiceProdotto());


        System.out.println(logitechG402.getBluetoothProdotto());

        System.out.println(logitechG402.getCodiceProdotto());
        logitechG402.setCodiceProdotto(30839);
        System.out.println(logitechG402.getCodiceProdotto());
   
        



    }
}