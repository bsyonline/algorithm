/*
 * @(#)Algo0402.java	1.0 2015/4/2
 *
 */
package com.rolex.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 完全平方数
 *
 * User: rolex
 * Date: 2015/4/2
 * version: 1.0
 */
public class Algo0402 {

    public static void main(String[] args) {
        Algo0402 algo = new Algo0402();
        List list = algo.fullSquare(1000);
        System.out.println(list);

        System.out.println(algo.isInteger("-2"));

        for(int i=0;i<=1000;i++){
            if(list.contains(i+100)&&list.contains(i+168)){
                System.out.print(i + ",");
            }
        }
    }

    public List<Integer> fullSquare(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=Math.sqrt(n);i++) {
            list.add(i*i);
        }
        return list;
    }

    public boolean isInteger(String s){
        Pattern p = Pattern.compile("^[+]?[\\d]*$");
        return p.matcher(s).matches();
    }
}
