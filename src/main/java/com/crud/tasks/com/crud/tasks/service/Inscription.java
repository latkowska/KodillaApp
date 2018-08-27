package com.crud.tasks.com.crud.tasks.service;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

class Inscription {
    public static void main(String[] args) {
        String sumA = "a";
        String letterA = "a";

        ArrayDeque<String> aCollection = new ArrayDeque<String>();
        Random theGenerator = new Random();
        int numberA = 0;

        while (aCollection.size() < 50) {
            numberA = theGenerator.nextInt(50);
            if (numberA != 0) {
                for (int i = 0; i <= numberA; i++)
                    sumA = sumA + letterA;
                aCollection.add(sumA );
            }
        }
        EvenUnevenSplit newTest = new EvenUnevenSplit();
        newTest.printEven(aCollection);
    }
}


class EvenUnevenSplit {


    ArrayList<String> evenA = new ArrayList<String>();
    ArrayList<String> unevenA = new ArrayList<String>();

    public void printEven(ArrayDeque<String> newCollection) {
        while (newCollection.size() > 0) {
            String testValue = newCollection.poll();
            if (testValue.length() > 0 && testValue.length() <50 && testValue.length() % 2 == 0) {
                evenA.add(testValue);
            } else {
                unevenA.add(testValue);
            }
        }
        System.out.println("Wielkość listy parzystej: " + evenA.size() + " Lista parzysta: " + evenA + "\n\n Wielkość listy nieparzystej: " + unevenA.size() + "Lista nieparzysta: " + unevenA);
    }
}





