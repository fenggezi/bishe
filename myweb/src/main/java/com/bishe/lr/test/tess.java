package com.bishe.lr.test;

import sun.misc.Unsafe;

import java.util.*;

public class tess {

    public static void main(String[] args) {
//      changge("qwerfdsa",3);
        int [] arr ={1,2,3};


        synchronized (tess.class){}

        Unsafe unsafe;
        ziji(arr);
    }


    public static  List<List<Integer>> ziji(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> list = new LinkedList<>();
            int count = 0;
            int rem = i;
            while(rem!=0){
                int a = nums[count];
                if(rem%2==1) list.add(a);
                rem/=2;
                count++;
            }
            res.add(list);
            System.out.println(list);
        }
        return res;
    }


    public static void changge(String str, int a) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < a; i++) {
            char t = strArr[0];
            for (int j = 0; j < str.length() - 1; j++) {
                strArr[j] = strArr[j + 1];
            }
            strArr[str.length() - 1] = t;
        }
    }


}
