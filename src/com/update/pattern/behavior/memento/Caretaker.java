package com.update.pattern.behavior.memento;

//备忘录管理类
public class Caretaker {

    private Memento mMemento;

    public void saveData(Memento memento) {
        mMemento = memento;
    }

    public Memento loadData() {
        return mMemento;
    }
}

