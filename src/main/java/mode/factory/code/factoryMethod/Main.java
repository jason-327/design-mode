package mode.factory.code.factoryMethod;

import mode.factory.code.factoryMethod.factory.AddComputeFactory;
import mode.factory.code.factoryMethod.factory.ComputeFactory;
import mode.factory.code.factoryMethod.product.ComputeProduct;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 10:47
 */
public class Main {

    /**
     * 工厂（方法）模式
     * 一个父工厂提供一类产品的接口，由多个子工厂进行实现，创建出各自的产品。.
     * 父工厂：创建运算，子工厂1：创建加法运算符，子工厂2：创建减法运算符…
     * 符合开闭原则。
     * 例子：java.lang.StringBuilder
     *
     * @param args
     */
    public static void main(String[] args) {
        ComputeFactory computeFactory = new AddComputeFactory();
        ComputeProduct computeProduct = computeFactory.getComputeProduct();
        computeProduct.setNumbereA(1D);
        computeProduct.setNumbereB(2D);
        System.out.println(computeProduct.getComputeResult());
    }
}
