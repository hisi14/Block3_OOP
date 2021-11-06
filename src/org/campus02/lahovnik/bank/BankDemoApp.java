package org.campus02.lahovnik.bank;

public class BankDemoApp {
    public static void main(String[] args) {

        System.out.println(Konto.s_anzahlKonto);
        Konto.s_anzahlKonto = 1001;
        Konto max = new Konto("Max Muster");
        //max.setInhaber("Max Mustermann");
        max.print();
        //max.s_anzahlKonto = 4;
        Konto susi = new Konto("Susi Sorglos");
        Konto john = new Konto("John Doe");
        john.print();
        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);


        susi.aufbuchen(100_000);
        susi.print();
    }
}
