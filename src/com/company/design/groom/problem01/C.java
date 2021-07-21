package com.company.design.groom.problem01;

import java.util.Scanner;

public class C {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     *
     * 입력 형식
     *  첫 줄에 세 자연수 N, M, S가 주어진다. 각각 교보문고에 있는 수정이를 제외한 사람의 수 N, 미주의 키 M, 지수의 키 S이다.
     *  두 번째 줄에 N명의 사람들의 키가 공백으로 구분되어 자연수로 입력된다.
     *  사람들의 수 N은 10,000이하의 자연수이며, 모든 사람들의 키는 1이상  300이하의 자연수이다.
     *
     * 출력 형식
     *  수정이가 미주와 지수를 찾기위해 확인해보아야 할 후보의 수를 출력한다. 첫 줄에 공백없이 정수로 출력하면 된다.
     *
     * @param data 각 사람들의 키를 저장한 배열
     * @param n     사람들의 수
     * @param m     미주의 키
     * @param s     지수의 키
     * @return      미주 혹은 지수와  키가 일치하는 사람의 수
     */
    public static int getCount(int[] data, int n, int m, int s)
    {
        int count = 0 ; //확인해보아야 할 후보의 수

        return count;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        int answer = getCount(data, n, m, s);

        System.out.println(answer);
    }

}
