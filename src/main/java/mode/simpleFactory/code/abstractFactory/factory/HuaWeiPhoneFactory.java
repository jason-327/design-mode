package mode.simpleFactory.code.abstractFactory.factory;

import mode.simpleFactory.code.abstractFactory.product.AbstractEjProduct;
import mode.simpleFactory.code.abstractFactory.product.AbstractSjxProduct;
import mode.simpleFactory.code.abstractFactory.product.HuaWeiEjProduct;
import mode.simpleFactory.code.abstractFactory.product.HuaWeiSjxProduct;

/**
 * 华为手机工厂
 */
public class HuaWeiPhoneFactory implements PhoneFactory {

    // 获取耳机产品
    @Override
    public AbstractEjProduct getEjProduct() {
        return new HuaWeiEjProduct();
    }

    // 获取数据线产品
    @Override
    public AbstractSjxProduct getSjxProduct() {
        return new HuaWeiSjxProduct();
    }
}
