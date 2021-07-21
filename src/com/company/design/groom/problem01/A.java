package com.company.design.groom.problem01;

import java.util.Scanner;

public class A {

    public static final Scanner scanner=new Scanner(System.in);
    /**
     * a.최대값 함수
     * 두 정수 a와 b중 더 큰 값을 반환하는 함수
     *
     * @param a
     * @param b
     * @return a와 b중 더 큰 값
     *
     * 입력 형식
     * 32비트 int형 정수 두 개가 공백으로 구분되어 한 줄에 주어진다.
     *
     * 출력 형식
     * 두 정수 중 큰 정수를 한 줄에 공백없이 출력한다.
     */

    public static int getMax(int a, int b){
        if (a>b){
            return a;
        }else if (a==b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) throws Exception{
        int p=scanner.nextInt();
        int q=scanner.nextInt();

        int result= getMax(p,q);
        System.out.println(result);
    }
}
