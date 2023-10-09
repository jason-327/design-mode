package mode.factory.code.abstractFactory.product;

/**
 * 小米数据线产品
 */
public class XiaoMiSjxProduct implements AbstractSjxProduct {
    // 获取耳机
    @Override
    public void sjxProduct() {
        System.out.println("获取小米数据线！");
    }
}
