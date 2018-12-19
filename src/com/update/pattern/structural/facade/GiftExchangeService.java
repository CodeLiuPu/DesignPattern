package com.update.pattern.structural.facade;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class GiftExchangeService {
    private QualityService qualityService = new QualityService();
    private PointsPaymentService paymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualityService.isAvailable(pointsGift)) {
            // 资格校验通过
            if (paymentService.pay(pointsGift)) {
                String shippingOrderNumber = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功 物流号为 " + shippingOrderNumber);
            }
        }
    }
}
