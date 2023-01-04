package mode.simpleFactory.code.easyFactory;

import mode.simpleFactory.code.easyFactory.factory.OperaionFactory;
import mode.simpleFactory.code.easyFactory.mode.Operation;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/14 9:36
 */
public class Main {

    /**
     * 简单工厂模式（静态工厂）
     * 一个工厂根据传入的参数不同创建出不同的产品。
     * 不符合开闭原则。
     * 例子：java.text.DateFormat。
     * @param args
     */
    public static void main(String[] args) {
        Operation operaion = OperaionFactory.createOperaion("+");
        operaion.setNumber_a(10D);
        operaion.setNumber_b(8D);
        Double result = operaion.getResult();
        System.out.println(result);
    }
}
