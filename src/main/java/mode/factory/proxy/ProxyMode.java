package mode.factory.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IHello {
    void say(String str);

    void say2(String str);
}

class Hello implements IHello {
    public void say(String str) {
        System.out.println(str);
    }

    public void say2(String str) {
        System.out.println(str);
    }
}

//代理类需要继承InvocationHandler

class ProxyHello {
    public Object start(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理开始===");
                Object result = method.invoke(target, args);
                System.out.println("代理结束***");
                return result;
            }
        });
    }
}

/**
 * @author jason
 * @version 1.0
 * @description: 代理模式
 * @date 2023/10/9 17:11
 */
public class ProxyMode {
    public static void main(String[] args) {
        IHello bind = (IHello) new ProxyHello().start(new Hello());
        bind.say("hello");
        bind.say2("hahaha");
    }
}
