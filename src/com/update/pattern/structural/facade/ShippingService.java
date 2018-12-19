package com.update.pattern.structural.facade;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNumber = "666";
        return shippingOrderNumber;
    }
}
