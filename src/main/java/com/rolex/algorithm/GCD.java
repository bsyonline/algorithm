/*
 * @(#)GCD.java	1.0 2015/3/30
 *
 */
package com.rolex.algorithm;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rolex
 * Date: 2015/3/30
 * version: 1.0
 */
public class GCD {

    public static void main(String[] args) {

    }

    private int print(int m,int n){
        List<Integer> l1 = qualityFactor(m);
        List<Integer> l2 = qualityFactor(n);
        l1.remove(l1.size()-1);
        l2.remove(l2.size()-1);
        int result = 1;
        for(Integer i : l1){
            result *= i;
        }
        return result;
    }

    private List qualityFactor(int i){
        return null;
    }


}
