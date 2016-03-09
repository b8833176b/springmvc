package com.gyw.test2;

/**
 * Created by Administrator on 2016/3/8.
 */
public class app1 {
    public static void main(String[] args) {
        Father f1 = new Son();
        f1.fatherSayHi();
        Son s1 = (Son)f1;
        s1.sonSayHi();
    }
}
