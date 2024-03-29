package mode.factory.code.factoryMethod.factory;

import mode.factory.code.factoryMethod.product.ComputeProduct;
import mode.factory.code.factoryMethod.product.MinusComputeProduct;

/**
 * @author jason
 * @version 1.0
 * @description: 减法计算工厂类
 * @date 2022/12/12 10:46
 */
public class MinusComputeFactory implements ComputeFactory {

    @Override
    public ComputeProduct getComputeProduct() {
        return new MinusComputeProduct();
    }
}
