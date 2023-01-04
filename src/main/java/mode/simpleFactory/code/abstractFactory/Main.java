package mode.simpleFactory.code.abstractFactory;

import mode.simpleFactory.code.abstractFactory.factory.PhoneFactory;
import mode.simpleFactory.code.abstractFactory.factory.XiaoMiPhoneFactory;
import mode.simpleFactory.code.abstractFactory.product.*;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 11:48
 */
public class Main {

    /**
     * 抽象工厂模式
     * 是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品；
     */
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new XiaoMiPhoneFactory();
        AbstractEjProduct ejProduct = phoneFactory.getEjProduct();
        ejProduct.ejProduct();
        AbstractSjxProduct sjxProduct = phoneFactory.getSjxProduct();
        sjxProduct.sjxProduct();
    }
}


