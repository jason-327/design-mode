package mode.simpleFactory.code.abstractFactory.product;

/**
 * 小米耳机产品
 */
public class XiaoMiEjProduct implements AbstractEjProduct {
    // 获取耳机
    @Override
    public void ejProduct() {
        System.out.println("获取小米耳机！");
    }
}
