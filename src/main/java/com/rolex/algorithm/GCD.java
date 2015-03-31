/*
 * @(#)GCD.java	1.0 2015/3/30
 *
 */
package com.rolex.algorithm;

/**
 * 最大公约数(m,n)-碾除法
 * User: rolex
 * Date: 2015/3/30
 * version: 1.0
 */
public class GCD {

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(319, 377));
    }

    public int gcd(int m, int n) {
        int big;
        int small;
        int result;
        if (m > n) {
            big = m;
            small = n;
        } else {
            big = n;
            small = m;
        }
        if (big % small != 0) {
            result = gcd(small, big % small);
        } else {
            result = small;
        }
        return result;

    }
}
