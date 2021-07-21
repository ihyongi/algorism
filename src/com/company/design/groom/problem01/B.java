package com.company.design.groom.problem01;

import java.util.Scanner;

public class B {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 배열의 최대값을 계산하는 함수.
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]중 최대값.
     *
     * 최종적으로 result는 data[0] ~ data[n-1]중 최대값을 가져야 한다.
     */
    public static int getMax(int[] data, int n) {
        int result=data[0];
        for(int i=0;i<n;i++){
            if(result<data[i]){
                data[i]= scanner.nextInt();
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.print("생성할 배열의 크기를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("data["+i+"]"+"번째 배열에 넣을 값을 입력해주세요(양수) : ");
            data[i] = scanner.nextInt();
        }
        int result = getMax(data, n);
        System.out.println("배열 중 최대값 : "+result);

    }
}
