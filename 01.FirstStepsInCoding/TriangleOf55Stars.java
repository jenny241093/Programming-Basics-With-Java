package com.company;

public class TriangleOf55Stars {
    public static void main(String[] args) {
        for (Integer i=1;i<=10;i++){

            String str = new String(new char[i]).replace("\0", "*");
            System.out.println(str);
        }

    }
}
