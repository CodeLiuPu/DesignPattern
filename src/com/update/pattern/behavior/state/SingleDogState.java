package com.update.pattern.behavior.state;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class SingleDogState implements PersonState{
    @Override
    public void watchMovies() {
        System.out.println("自己用电脑开电影");
    }

    @Override
    public void shopping() {
        System.out.println("自己一个人逛街");
    }
}
