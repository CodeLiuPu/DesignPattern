package com.update.pattern.behavior.strategy;

/**
 * @author : liupu.
 * @date : 2018/12/15
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
   public PromotionActivity(PromotionStrategy promotionStrategy){
       this.promotionStrategy = promotionStrategy;
   }

   public void excutePromotionStrategy(){
       promotionStrategy.doPromotion();
   }
}
