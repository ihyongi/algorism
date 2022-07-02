package com.company.design.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class String_1_01 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //인덱스로 접근하기
        for(int i=0 ; i< str.length(); i++){
            if(str.charAt(i) == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        String_1_01 string_1_01 = new String_1_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.println(string_1_01.solution(str, c));
    }
}
