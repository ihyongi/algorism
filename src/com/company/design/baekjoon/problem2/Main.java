package com.company.design.baekjoon.problem2;

public class Main {
    /**
     * 2.
     * 문제소개
     * -피보나치 수열을 출력해라
     * -An =An-1 +An-2
     * -1 1 2 3 5 8 13 21 34...
     * <p>
     * 태그
     * 배열, for
     */
    public static void main(String[] args) {
        int[] arr = new int[100];

        //An = An-1 + An-2;  n>=3
        //a1 = 1, a2 = 1
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(arr[i] + " ");
        }

        //2¹øÂ° ¹æ¹ý.
        //An
        //An = An-1 + An-2;  n>=3
        //a1 = 1, a2 = 1
        System.out.println();

        int prevPrevNum = 1; //An-2
        int prevNum = 1;      //An-1
        System.out.print(prevPrevNum + " ");
        System.out.print(prevNum + " ");

        for (int i = 3; i <= 10; i++) {
            int nNum = prevPrevNum + prevNum;
            System.out.print(nNum + " ");

            prevPrevNum = prevNum;
            prevNum = nNum;
        }
    }
}

