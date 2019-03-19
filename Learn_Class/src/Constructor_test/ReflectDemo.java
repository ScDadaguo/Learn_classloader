package Constructor_test;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo  implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz=Class.forName("Constructor_test.User");
//        User user= (User) clazz.newInstance();
//        user.setAge(10);
//        user.setUserName("guohao");
//        System.out.println(user);
//        System.out.println("//————————————————————————————————//");

//        Constructor constructor=clazz.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        User user2= (User) constructor.newInstance("guohao",20);
//        System.out.println(user2);

        Constructor[] constructors=clazz.getDeclaredConstructors();
        for (int i = 0; i <constructors.length ; i++) {
            System.out.println(constructors[i].toString());
            Class[] clazz2=constructors[i].getParameterTypes();
            for (int j = 0; j <clazz2.length ; j++) {
                System.out.println(clazz2[j].getName());

            }
        }





    }



}
