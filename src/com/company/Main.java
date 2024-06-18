package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 2 valori numerici con al centro un operando (es. 1 + 1)");
        checkOperator(scanner);

    }

    //Funzione checkOperator che riconosce l'operando scritto dall'utente
    public static void checkOperator(Scanner scanner){
        String scannerValue = scanner.nextLine();

        //Utilizzo split per dividere il contenuto dello scanner e come delimitatore utilizzo lo spazio
        //i contenuti splittati verranno poi inseriti all'interno di un'array
        String[] stringArray = scannerValue.split(" ");

        float value1 = Float.parseFloat(stringArray[0]);
        float value2 = Float.parseFloat(stringArray[2]);
        String operator = stringArray[1];

        if (operator.equals("+")){
            System.out.println("Rilevata addizione");
            sum(value1,value2);
        }
        else if (operator.equals("-")){
            System.out.println("Rilevata sottrazione");
            subtraction(value1,value2);
        }
        else if (operator.equals("/")) {
            System.out.println("Rilevata Divisione");
            division(value1,value2);
        }
        else if (operator.equals("*")){
            System.out.println("Rilevata Moltiplicazione");
            multiplication(value1,value2);
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
}
