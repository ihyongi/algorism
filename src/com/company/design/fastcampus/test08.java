package com.company.design.fastcampus;

import java.util.ArrayList;

public class test08<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1); //마지막번째 인덱스번호를 넣어서 지움
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public static void main(String[] args) {
    /*
    - JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
    - pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
    - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
     */

        test08<Integer> ms = new test08<Integer>();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop()); //2
        ms.push(3);
        System.out.println(ms.pop()); //3
        System.out.println(ms.pop()); //1
    }
}
