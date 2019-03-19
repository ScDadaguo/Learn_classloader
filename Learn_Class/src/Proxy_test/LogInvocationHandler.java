package Proxy_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

// Java Proxy
// 1. 首先实现一个InvocationHandler，方法调用会被转发到该类的invoke()方法。
public class LogInvocationHandler implements InvocationHandler {
    private Hello hello;
    public LogInvocationHandler(Hello hello) {
        this.hello = hello;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sayHello".equals(method.getName())) {
            System.out.println("You said: " + Arrays.toString(args));
        }
        return method.invoke(hello,args);
    }


    public static void main(String[] args) {
        Hello hello = (Hello) Proxy.newProxyInstance(
                LogInvocationHandler.class.getClassLoader(),
                new Class[]{Hello.class},
                new LogInvocationHandler(new HelloImp())
        );
        hello.sayHello("I LOVE YOU");
        System.out.println(hello.sayHello("I LOVE YOU"));
        System.out.println(LogInvocationHandler.class.getClassLoader());

    }
}
