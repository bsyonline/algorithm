/*
 * @(#)GCD.java	1.0 2015/3/27
 *
 */
package com.rolex.algorithm;

/**
 * 最大公约数(m,n)-碾除法
 *
 * User: rolex
 * Date: 2015/3/27
 * version: 1.0
 */
public class Algo0327 {

    public static void main(String[] args) {
        Algo0327 g = new Algo0327();
        System.out.println(g.gcd(319, 377));
        System.out.println(g.lcm(18, 20));
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

    public int lcm(int m, int n) {
        int g = gcd(m, n);
        return m * n / g;
    }
}
