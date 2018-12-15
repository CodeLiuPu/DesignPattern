package com.update.pattern.behavior.strategy;

/**
 * @author : liupu.
 * @date : 2018/12/15
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
