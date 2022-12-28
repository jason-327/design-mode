package mode.simpleFactory.code.abstractFactory.factory;

import mode.simpleFactory.code.abstractFactory.product.AbstractEjProduct;
import mode.simpleFactory.code.abstractFactory.product.AbstractSjxProduct;

/**
 * 手机工厂
 */
public interface PhoneFactory {
    // 获取耳机
    AbstractEjProduct getEjProduct();

    // 获取数据线
    AbstractSjxProduct getSjxProduct();
}
