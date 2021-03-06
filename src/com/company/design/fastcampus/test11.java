package com.company.design.fastcampus;

import java.util.HashMap;

public class test11 {

    public Slot[] hashTable;

    public test11(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            } else {
                // 참고: 다음 코드를 수정합니다.
                // Integer currAddress = address + 1;
                // 예외 케이스로, 키에 해당하는 주소가 가장 마지막 슬롯일 경우,
                // this.hashTable[address + 1] 에 해당하는 배열은 없기 때문에,
                // 예외 케이스에서도 동작하도록 currAddress 는 address 만 대입하고 진행합니다
                Integer currAddress = address; // 수정
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        test11 mainObject = new test11(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.saveData("David", "01044445555");
        mainObject.saveData("Dave", "01055556666");
        mainObject.getData("fun-coding");
        System.out.println("mainObject.getData(\"fun-coding\") = " + mainObject.getData("fun-coding"));

        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "사과");
        map1.put(2, "바나나");
        map1.put(3, "포도");

        HashMap<String, String> map2 = new HashMap();
        map2.put("DaveLee", "01033334444");
        map2.put("Dave", "01032221111");
        map2.put("David", "0104445555");

        System.out.println("map1.get(2) = " + map1.get(2));
        System.out.println("map2.get(Dave) = " + map2.get("Dave"));
        //배열의 경우에는 O(n) << 해시테이블 케이스에서 검색할때는 O(1)
    }
}
