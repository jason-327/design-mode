package mode.simpleFactory.code.factoryMethod.factory;

import mode.simpleFactory.code.factoryMethod.product.ComputeProduct;

/**
 * @author jason
 * @version 1.0
 * @description: 计算工厂类
 * @date 2022/12/12 10:44
 */
public interface ComputeFactory {

    ComputeProduct getComputeProduct();
}
