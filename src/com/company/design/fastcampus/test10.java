package com.company.design.fastcampus;

public class test10 {
    //O(n)
    public int sum(int n){
        int total=0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    //얘가 성능이 더 좋다 O(1)
    public int sum1(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        test10 mainObject = new test10();
        mainObject.sum(10);
        System.out.println("mainObject = " + mainObject.sum(10));

        mainObject.sum1(10);
        System.out.println("mainObject1 = " + mainObject.sum1(10));
    }
}
