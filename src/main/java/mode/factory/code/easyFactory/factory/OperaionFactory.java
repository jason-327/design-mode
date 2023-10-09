package mode.factory.code.easyFactory.factory;

import mode.factory.code.easyFactory.mode.Operation;
import mode.factory.code.easyFactory.mode.OperationMinus;
import mode.factory.code.easyFactory.mode.OperationAdd;

/**
 * @author jason
 * @version 1.0
 * @description: 运算简单工厂
 * @date 2022/10/18 14:39
 */
public class OperaionFactory {

    public static Operation createOperaion(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationMinus();
                break;
        }

        return operation;
    }
}
