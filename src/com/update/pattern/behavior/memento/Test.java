package com.update.pattern.behavior.memento;

public class Test {
    public static void main(String[] args) {
        System.out.println("首次进入游戏");
        Game game = new Game();
        game.play();

        Memento memento = game.saveData();
        Caretaker caretaker = new Caretaker();
        caretaker.saveData(memento);
        game.exit();

        System.out.println("-------------");
        System.out.println("二次进入游戏");

        Game secondGame = new Game();
        secondGame.loadData(caretaker.loadData());
        secondGame.play();
        secondGame.exit();

    }
}
