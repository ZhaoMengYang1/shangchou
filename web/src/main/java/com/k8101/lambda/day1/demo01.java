package com.k8101.lambda.day1;

import org.junit.Test;

public class demo01 {
    public static void main(String[] args) {


//        Calculator a = new Calculator() {
//            @Override
//            public int calc(int a, int b) {
//                return a+b;
//            }
//
//        };
        Runnable task = new Runnable() {
            @Override
            public void run() {

            }
        };





    }
    public  void invokeCalc(int a,int b) {
//　　　　　　int result = calculator.calc(a, b);
//　　　　　　System.out.println("结果是：" + result);
        System.out.println((a+b));
    }
    public int add(int a,int b,Calculator calculator){


        return calculator.calc(a,b);
    }




}
