package com.company.design.baekjoon.problem1158;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int index = 0; // 리스트의 첫 index는 0부터! 들어가는 숫자는 1들어가있음

        while(list.size() > 1) {
            index = (index + (K - 1)) % list.size();

            sb.append(list.remove(index)).append(", ");
        }

        sb.append(list.remove()).append(">");
        System.out.println(sb);

        scan.close();
    }
}
