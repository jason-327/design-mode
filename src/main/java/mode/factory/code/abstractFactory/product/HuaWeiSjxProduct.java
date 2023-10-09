package mode.factory.code.abstractFactory.product;

/**
 * 华为数据线产品
 */
public class HuaWeiSjxProduct implements AbstractSjxProduct {
    // 获取耳机
    @Override
    public void sjxProduct() {
        System.out.println("获取华为数据线！");
    }
}
