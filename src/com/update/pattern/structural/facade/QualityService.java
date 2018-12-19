package com.update.pattern.structural.facade;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class QualityService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过,库存通过");
        return true;
    }

}
