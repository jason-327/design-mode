package mode.factory.code.abstractFactory.product;

/**
 * 华为耳机产品
 */
public class HuaWeiEjProduct implements AbstractEjProduct {
    // 获取耳机
    @Override
    public void ejProduct() {
        System.out.println("获取华为耳机！");
    }
}
