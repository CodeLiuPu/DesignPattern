package com.update.pattern.structural.proxy._static;


public class Test {
    public static void main(String[] args) {
        People domestic = new Domestic();
        People oversea = new Oversea(domestic);
        oversea.buy();
    }
}
