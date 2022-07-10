package com.company.design.leetcode;

import java.util.ArrayList;

public class LinkedListCycle_141 {

    /**
     * Definition for singly-linked list.
     * LinkedList가 Cycle을 가지고 있는지 찾는 문제
     * head 에서부터 List를 순환하다가 다음 노드가 이전노드를 발견하면 Cycle이 있는 경우이니 바로 true를 return 한다.
     * 이전에 있는 노드를 발견하지 못하고 next가 null 일 경우 Cycle이 없는 경우니 false를 return 한다.
     */

    public class Solution {

        public boolean hasCycle(ListNode head) {

            ArrayList<ListNode> arraylist = new ArrayList();
            if (head == null || head.next == null){
                return false;
            }

            while(true){
                // ListNode를 while문으로 -> ArrayList에 저장
                arraylist.add(head);
                head = head.next;

                // arraylist를 for문을 이용해 ListNode의 val 이 ArrayList에 있는지를 판단
                for(int i = 0 ; i < arraylist.size(); i++){
                    if (arraylist.get(i) == head){
                        return true;
                    }
                }
                if (head.next == null){
                    break;
                }
            }
            return false;
        }
    }

    //힌트를 잘활용하자!
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
