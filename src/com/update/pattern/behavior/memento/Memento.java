package com.update.pattern.behavior.memento;

//备忘录类
public class Memento {
    public int level;//等级
    public int coin;//金币数量

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getLevel() {
        return level;
    }

    public int getCoin() {
        return coin;
    }
}