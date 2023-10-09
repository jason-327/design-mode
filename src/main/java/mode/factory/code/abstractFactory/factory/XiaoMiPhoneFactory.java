package mode.factory.code.abstractFactory.factory;

import mode.factory.code.abstractFactory.product.AbstractEjProduct;
import mode.factory.code.abstractFactory.product.AbstractSjxProduct;
import mode.factory.code.abstractFactory.product.XiaoMiEjProduct;
import mode.factory.code.abstractFactory.product.XiaoMiSjxProduct;

/**
 * 小米手机工厂
 */
public class XiaoMiPhoneFactory implements PhoneFactory {

    // 获取耳机产品
    @Override
    public AbstractEjProduct getEjProduct() {
        return new XiaoMiEjProduct();
    }

    // 获取数据线产品
    @Override
    public AbstractSjxProduct getSjxProduct() {
        return new XiaoMiSjxProduct();
    }
}
