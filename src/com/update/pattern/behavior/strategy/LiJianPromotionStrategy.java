package com.update.pattern.behavior.strategy;

/**
 * @author : liupu.
 * @date : 2018/12/15
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
