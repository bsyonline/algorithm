/*
 * @(#)PerfectNumber.java	1.0 2015/3/31
 *
 */
package com.rolex.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 完数，所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身
 * User: rolex
 * Date: 2015/3/31
 * version: 1.0
 */
public class PerfectNumber {

    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();
        System.out.println(p.perfectNumber(1000));
    }

    public List<Integer> perfectNumber(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            if(i == sum(i)){
                list.add(i);
            }
        }
        return list;
    }

    public int sum(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
