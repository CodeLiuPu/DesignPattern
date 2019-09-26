package com.update.pattern.behavior.strategy.v1;

/**
 * @author : liupu.
 * date    : 2018/12/15
 * desc    :
 * github  : https://github.com/CodeLiuPu/
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excutePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
