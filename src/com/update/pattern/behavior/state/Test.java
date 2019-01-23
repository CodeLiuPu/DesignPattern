package com.update.pattern.behavior.state;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class Test {

    public static void main(String[] args) {
        PersonContext personContext = new PersonContext();
        personContext.setPersonState(new LoveState());
        personContext.watchMovies();
    }
}
