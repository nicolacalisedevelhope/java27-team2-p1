package com.company;

public class Main {

    public static void division(float val1, float val2) {
        if (val2 == 0) {
            System.out.println("Errore, non può essere effettuata divisione per zero!");
        }
        else {
            float risultato = val1 / val2;
            System.out.println("Il risultato della divisione è: " + risultato);
        }
    }

}