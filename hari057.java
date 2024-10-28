package hari057;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            int input = in.nextInt();
            if(input%2==0){
                kondisi = true;
            } else {
                kondisi=false;
            }
        }
    }
}
