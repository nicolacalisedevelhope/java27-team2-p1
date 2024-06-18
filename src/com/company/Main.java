package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFunctioning = true;
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("| Inserisci 2 valori numerici con al centro un'operando (es. 1 + 1) lista operandi disponibili:|");
        System.out.println("|     (+)Addizione, (-)Sottrazione, (*)Moltiplicazione, (/)Divisione, (^)Potenza.              |");
        System.out.println("|     Inoltre inserendo un singolo numero (es. 2) si calcolerà se è pari o dispari.            |");
        System.out.println("|                         Per uscire dal programma scrivere 'exit'.                            |");
        System.out.println("------------------------------------------------------------------------------------------------");
        while(isFunctioning){
            System.out.print("Input: ");
            String scannerValue = scanner.nextLine();

            if(scannerValue.equalsIgnoreCase("exit")){
                System.out.println("Fine Operazioni");
                isFunctioning = false;
            }
            else{
                checkOperator(scannerValue);
            }

        }


    }

    //Funzione checkOperator che riconosce l'operando scritto dall'utente
    public static void checkOperator(String scanner){

        //Utilizzo split per dividere il contenuto dello scanner e come delimitatore utilizzo lo spazio
        //i contenuti splittati verranno poi inseriti all'interno di un'array
        String[] stringArray = scanner.split(" ");

        if(stringArray.length == 1){
            float isEvenNumber = Float.parseFloat(stringArray[0]);
            isEven(isEvenNumber);
        }
        else{
            float value1 = Float.parseFloat(stringArray[0]);
            float value2 = Float.parseFloat(stringArray[2]);
            String operator = stringArray[1];


            switch (operator){
                case "+":
                    // System.out.println("Rilevata addizione");
                    sum(value1,value2);
                    break;
                case "-":
                    // System.out.println("Rilevata sottrazione");
                    subtraction(value1,value2);
                    break;
                case "*":
                    // System.out.println("Rilevata Moltiplicazione");
                    multiplication(value1,value2);
                    break;
                case "/":
                    // System.out.println("Rilevata Divisione");
                    division(value1,value2);
                    break;
                case "^":
                    // System.out.println("Rilevata Potenza");
                    power(value1,value2);
                    break;
            }
        }


    }

    // Modulo per eseguire e stampare moltiplicazione
    public static void multiplication (float val1, float val2 ){
        float risultato = val1 * val2;
        System.out.println("Il risultato della moltiplicazione è: " +  risultato);
    }

    // Modulo per eseguire e stampare divisione
    public static void division(float val1, float val2) {
        if (val2 == 0) {
            System.out.println("Errore, non può essere effettuata divisione per zero!");
        }
        else {
            float risultato = val1 / val2;
            System.out.println("Il risultato della divisione è: " + risultato);
        }
    }
    // Modulo per eseguire e stampare somma
    public static void sum(float val1, float val2){
        float sumResult = val1 + val2;
        System.out.println("Il risultato dell'addizione è: " + sumResult);
    }

    // Modulo per eseguire e stampare sottrazione
    public static void subtraction(float val1, float val2){
        float subtractionResult = val1 - val2;
        System.out.println("Il risultato della sottrazione è : " + subtractionResult);
    }

    // Modulo per eseguire e stampare la potenza
    public static void power(float base, float esponente) {
        float potenza = 1;

        if (esponente < 0) {
            for (int i = 0; i > esponente; i--) {
                potenza *= base;
            }
            potenza = 1 / potenza; // Inverte il risultato visto che l'esponente è negativo
        }
        else { //Se l'esponente è positivo, calcoliamo la potenza in modo ricorsivo
            for (int i = 0; i < esponente; i++) {
                potenza *= base;
            }
        }
        System.out.println("Il risultato della potenza è :" + potenza);
    }

    //Modulo per eseguire il controllo del numero se è pari o dispari
    public static void isEven(float tmp){
        if(tmp % 2 == 0){
            System.out.println("Il numero inserito " + tmp + " è Pari!");
        }
        else{
            System.out.println("Il numero inserito " + tmp + " è Dispari!");
        }
    }
}