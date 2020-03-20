package com.company;

public class Main {

    public static void main(String[] args) {
	    // ADAMOV MAXIM
        System.out.println (" zadanie 1");
        System.out.println(zadanie_1(10,2));
	    System.out.println (" zadanie 2");
	    zadanie_2();
	    System.out.println ("\n zadanie 3");
	    zadanie_3();
    }

    private static boolean zadanie_1(int h, int j){
        return ((h + j) >= 10) & ((h + j) <= 20);
    }

    private static void zadanie_2(){
        int[] k = new int[8];
        for (int i =0; i<8; i++){
            k[i] = i * 3;
            System.out.print(k[i] + " ");
        }
    }

    private static void zadanie_3(){
        int[] k = {1, 5, 3 ,2 ,11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : k) {
            if (value < 6) {
                value *= 2;
            }
            System.out.print(value + " ");
        }
    }
}
