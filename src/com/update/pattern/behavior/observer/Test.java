package com.update.pattern.behavior.observer;

public class Test {
    public static void main(String[] args) {
        Observable postman = new PostMan();

        Observer boy = new Boy("路飞");
        Observer girl = new Girl("娜美");

        postman.add(boy);
        postman.add(girl);

        postman.notify("有快递啦");
    }
}
