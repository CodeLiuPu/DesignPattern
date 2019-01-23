package com.update.pattern.behavior.state;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class PersonContext {
    private PersonState personState;

    public void setPersonState(PersonState personState) {
        this.personState = personState;
    }

    public void fallInLove(){
        System.out.println("恋爱了");
        setPersonState(new LoveState());
    }

    public void disappointInLove(){
        System.out.println("失恋了");
        setPersonState(new SingleDogState());
    }

    public void watchMovies() {
       personState.watchMovies();
    }

    public void shopping() {
        personState.shopping();
    }

}
