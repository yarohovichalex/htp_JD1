/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Алексей
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    //для вывода массива
    public static void arrayOutput(int[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(" "+array[i]);
            }
            System.out.println();
    }
    //перегружен, вывод массива char
    public static void arrayOutput(char[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
            }
            System.out.println();
    }
    public static void arrayOutput(int[][] arrD) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 5; j++) {
                        System.out.print(" "+ arrD[i][j]);
                }
                System.out.println();
            }
    }
    public static void arrayOutput(double[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.print(" "+array[i]);
            }
            System.out.println();
    }
    //#1
    static int[] one(){
            int num;
            System.out.print("Исходный массив:");
            int[] arr = new int[10];
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                    num = 0 + random.nextInt(20 - 0);
                    arr[i] = num;
                    System.out.print(" " + arr[i]);
            }
            System.out.println();
            return arr;
}
    static int[][] oneTwo(){
        int num;           
                System.out.println("Исходный массив:");
                int [][] array = new int [7][5];
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                num = 0 + random.nextInt(20 - 0);
                                array[i][j] = num;
                        }					
                }
        return array;
    }
    public static void search(int [] arr) {
            int tmp = 0;
            for (int i = 0; i < arr.length-1; i++) {
                            if(arr[i]>tmp) {
                                    tmp = arr[i];							
                            }
                    }		        	
            System.out.println("Максимум: "+tmp);
            for (int i = 0; i < arr.length; i++) {
                            System.out.printf(" %.3f",(double)arr[i]/tmp);
                    }
    }
    public static void two() {
            int j = 0;
            double sum = 0;		        	
            double []arr = {20.3, -14.5, 3.4, -5.6, 7.8, -4.6, -7.8, -9.3, 7.1, -4.1, 5.1, 6.2, 1.2, -1.3, -2.2, 5.5, -7.9, 6.6, 7.3, -3.7, -15.7, 14.8, -12.1, 11.5, -13.6, -18.2, -1.3, 19.8, 19.0, 21.6, -6.5, -19.5, 3.1, 5.5, -15.5, 4.0, 5.2, -7.7, -16.0, 17};
            for (int i = 0; i < arr.length; i+=2) {
                    if(arr[i]>0) {
                            j++;
                    }
                    }
            double [] newArr = new double[j];
            j=0;
            for(int i = 0; i < arr.length; i+=2) {
                    if(arr[i]>0) {
                            newArr[j] = arr[i];
                            j++;
                    }
            }
            System.out.println("Array A: ");
            arrayOutput(arr);
            System.out.println("Array b: ");
            arrayOutput(newArr);
            for (int i = 0; i < newArr.length; i++) {
                            sum += newArr[i] * newArr[i];
                    }
            System.out.println("sq.sum: " + sum);
    }
    public static void three() {
            Scanner in = new Scanner(System.in);
            int num;           
                    System.out.println("Исходный массив:");
                    int [][] tmp = new int [1][1];
                    int [][] arrD = new int [7][5];
                    Random random = new Random();
                    for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 5; j++) {
                                    num = 0 + random.nextInt(20 - 0);
                                    arrD[i][j] = num;
                            }					
                    }
                    for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 5; j++) {
                                    System.out.print(" "+ arrD[i][j]);
                            }
                            System.out.println();
                            
                    }   
                    /*int i = 0;
                    int[] strIntArr = new int[1];
                    char[] charStr = new char[5];*/
                    System.out.println("Какие строки обменять: ");
                    int str1 = in.nextInt();
                    int str2 = in.nextInt();
                   /*charStr = str.toCharArray();
                    for (int j = 0; j < strIntArr.length; j++) {
                        if(instanceOf(charStr[1]))
        }*/
                    for (int fsb = 0, ssb=0; fsb < 5; fsb++, ssb++) {                            
                                tmp[0][0] = arrD[str1][fsb];
                                arrD[str1][fsb] = arrD[str2][ssb];
                                arrD[str2][ssb] = tmp[0][0];
                                //break;                            						
                    }
                    arrayOutput(arrD);
    }
    public static void four(int[][] arrD){
        int st = 0;        
        for (int sb = 0; sb < 5; sb++) {
            int maxSb = arrD[0][sb];
            for (st = 0; st <= 6; st++) {
                if(arrD[st][sb]>maxSb){
                    maxSb = arrD[st][sb];
                }                
            }
            System.out.println("max: " + maxSb);            
        }
    }
    public static void five(int[][] arrD){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int elem = in.nextInt();
        int st = 0; 
        int sch = 0;
        for (int sb = 0; sb < 5; sb++) {            
            for (st = 0; st <= 6; st++) {
                if(arrD[st][sb] == elem){
                    sch++;
                }                
            }                        
        }
        System.out.println("Элемент встречается: " + sch + " раз");
    }
            
    public static void main(String[] args) {
        //int[]array = one();
		//search(array);
		//two();
		//three();
            
                arrayOutput(one());
                //four(arrD);
                five(oneTwo());
    }
    
}
