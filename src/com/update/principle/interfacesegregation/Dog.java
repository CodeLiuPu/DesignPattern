package com.update.principle.interfacesegregation;

import org.omg.CORBA.IRObject;

public class Dog implements ISwimAnimalAction,IEatAnimalAction{
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
