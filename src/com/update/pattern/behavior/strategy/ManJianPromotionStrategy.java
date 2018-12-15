package com.update.pattern.behavior.strategy;

/**
 * @author : liupu.
 * @date : 2018/12/15
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
