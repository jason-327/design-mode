package mode.simpleFactory.code.easyFactory.mode;

/**
 * @author jason
 * @version 1.0
 * @description: 运算类-加法
 * @date 2022/10/18 14:34
 */
public class OperationAdd extends Operation{

    @Override
    public Double getResult() {
        return getNumber_a() + getNumber_b();
    }
}
