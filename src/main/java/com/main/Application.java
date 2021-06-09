package com.main;

public class Application {
    public static void main(String[] args) {
        int[] Array = new int[10];
        setArrayToZero(Array);
        System.out.println("first 10 elements are set to zero:");
        for (int count = 0; count < Array.length; count++) {
            System.out.print("\t" + Array[count]);
        }
        int bonusArray[] = new int[15];
        getBonus(bonusArray);
        for (int j = 0; j < bonusArray.length; j++) {
            System.out.print("\t" + bonusArray[j]);
        }
        int bestScores[] = {100, 95, 67, 43, 55};
        getBestScores(bestScores);
        System.out.print("BestScores in column format:");
        System.out.println("\nrow\t\tcolumn");
        for (int k = 0; k < bestScores.length; k++) {
            System.out.println(k + "\t\t" + bestScores[k]);
        }
    }
    private static void setArrayToZero(int zeroArray[]) {
        for (int i = 0; i < zeroArray.length; i++) {
            zeroArray[i] = 0;
        }
    }
    private static void getBonus(int bonus[]) {
        for (int j = 0; j < bonus.length; j++) {
            bonus[j]++;
        }
    }
    private static void getBestScores(int bestScores[]) {
        System.out.println();
        for (int k = 0; k < bestScores.length; k++) {
            bestScores[k] = bestScores[k];
        }
    }
}
