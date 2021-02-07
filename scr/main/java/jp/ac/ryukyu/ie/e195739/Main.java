package jp.ac.ryukyu.ie.e195739;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Random r = new Random();
        int i1 = r.nextInt(100); //1~100のかなの一個任意な値を生成する
        System.out.println("ランダムの値は" + i1);
        System.out.println("1-100の間、整数を入力してください。");
        Scanner sc=new Scanner(System.in);//playerが数値を入力する
        while(true) {
            int b = sc.nextInt();
        }

    }
}
