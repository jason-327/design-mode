package mode.simpleFactory.code.factoryMethod.factory;

import mode.simpleFactory.code.factoryMethod.product.AddComputeProduct;
import mode.simpleFactory.code.factoryMethod.product.ComputeProduct;

/**
 * @author jason
 * @version 1.0
 * @description: 加法计算工厂类
 * @date 2022/12/12 10:45
 */
public class AddComputeFactory implements ComputeFactory {

    @Override
    public ComputeProduct getComputeProduct() {
        return new AddComputeProduct();
    }
}
