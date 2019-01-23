package com.update.pattern.behavior.state;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class LoveState implements PersonState {
    @Override
    public void watchMovies() {
        System.out.println("一起去电影院看电影");
    }

    @Override
    public void shopping() {
        System.out.println("一起去开心的逛街");
    }
}
