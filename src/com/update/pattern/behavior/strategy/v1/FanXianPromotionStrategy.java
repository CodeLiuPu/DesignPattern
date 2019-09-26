package com.update.pattern.behavior.strategy.v1;

/**
 * @author : liupu.
 * date    : 2018/12/15
 * desc    :
 * github  : https://github.com/CodeLiuPu/
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
