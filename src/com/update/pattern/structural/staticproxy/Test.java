package com.update.pattern.structural.staticproxy;

public class Test {
    public static void main(String[] args) {
        People domestic = new Domestic();
        People oversea = new Oversea(domestic);
        oversea.buy();
    }
}
