package com.update.pattern.behavior.strategy.v1;

/**
 * @author : liupu.
 * date    : 2018/12/15
 * desc    : 策略模式 测试类
 * github  : https://github.com/CodeLiuPu/
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        PromotionActivity promotionActivity1212 = new PromotionActivity(new ManJianPromotionStrategy());

        promotionActivity618.excutePromotionStrategy();
        promotionActivity1111.excutePromotionStrategy();
        promotionActivity1212.excutePromotionStrategy();
    }
}
