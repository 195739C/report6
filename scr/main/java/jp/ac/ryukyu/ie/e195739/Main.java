package jp.ac.ryukyu.ie.e195739;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random r = new Random();
        int i1 = r.nextInt(100); //1~100のかなの一個任意な値を生成する
        System.out.println("ランダムの値は" + i1);
    }
}
