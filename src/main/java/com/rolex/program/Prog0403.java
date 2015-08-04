/*
 * @(#)Prog0403.java	1.0 2015/4/3
 *
 */
package com.rolex.program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期计算
 *
 * User: rolex
 * Date: 2015/4/3
 * version: 1.0
 */
public class Prog0403 {

    public static void main(String[] args) throws Exception {
        Prog0403 prog = new Prog0403();
        prog.print("2015-04-03");
    }

    public void print(String s) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        System.out.println("这个月的第几周："+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("当年的第几天："+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("当年的第几周："+c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("周几："+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("当月第几天：" + c.get(Calendar.DAY_OF_MONTH));
    }
}
