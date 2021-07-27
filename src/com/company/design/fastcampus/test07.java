package com.company.design.fastcampus;

import java.util.ArrayList;

public class test07<T> {

    private ArrayList<T> queue=new ArrayList<>();

    //넣기
    public void enqueue(T item){
        queue.add(item);
    }

    //빼기
    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0); //어레이리스트에서 맨앞꺼를 제거해야 ->queue
    }

    //판단하기
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        /*
        - JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기 <br>
        - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함 <br>
        - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
         */

        test07<Integer> mq = new test07<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue()); //1
        System.out.println(mq.dequeue()); //2
        System.out.println(mq.dequeue()); //3
    }
}
