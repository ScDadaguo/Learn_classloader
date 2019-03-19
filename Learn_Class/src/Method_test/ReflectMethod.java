package Method_test;

import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Method_test.Circle");
        Method method=clazz.getMethod("draw",int.class,String.class);
        System.out.println("Method:"+method);
        //获取所有public的方法:
        Method[] methods =clazz.getMethods();
        for (Method m:methods){
            System.out.println("m::"+m);
        }

        System.out.println("=========================================");
//获取当前类的方法包含private,该方法无法获取继承自父类的method
        Method method1 = clazz.getDeclaredMethod("drawCircle");
        System.out.println("method1::"+method1);
        //获取当前类的所有方法包含private,该方法无法获取继承自父类的method
        Method[] methods1=clazz.getDeclaredMethods();
        for (Method m:methods1){
            System.out.println("m1::"+m);
        }
   //————————————————————————————————//



    }
}
