package com.bishe.lr.controller;

import java.util.LinkedList;
import java.util.List;

public class test {


    public static  List<List<Integer>> ziji(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> list = new LinkedList<>();
            int count = 0;
            int rem = i;
            while(rem!=0){
                if(rem%2==1) list.add(nums[count]);
                rem/=2;
                count++;
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
     test.changge("asdfg",2);

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
        System.out.println(strArr);
    }



}
