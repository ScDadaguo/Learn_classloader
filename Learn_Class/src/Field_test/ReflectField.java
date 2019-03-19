package Field_test;

import java.lang.reflect.Field;

public class ReflectField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        Class clazz=Class.forName("Field_test.Student");
//        Field field=clazz.getField("age");
//        System.out.println("field:"+field);
//
//        //获取所有修饰符为public的字段,包含父类字段,注意修饰符为public才会获取
//        Field fields[] = clazz.getFields();
//        for (Field f:fields) {
//            System.out.println("f:"+f.getDeclaringClass());
//        }
//
//        System.out.println("================getDeclaredFields====================");
//        //获取当前类所字段(包含private字段),注意不包含父类的字段
//        Field fields2[] = clazz.getDeclaredFields();
//        for (Field f:fields2) {
//            System.out.println("f2:"+f.getDeclaringClass());
//        }
//        //获取指定字段名称的Field类,可以是任意修饰符的自动,注意不包含父类的字段
//        Field field2 = clazz.getDeclaredField("desc");
//        System.out.println("field2:"+field2);
//

        //————————————————————————————————//
        Class clazz = Class.forName("Field_test.Student");
        Student st=(Student) clazz.newInstance();
        st.setAge(20);
//        Field ageField=clazz.getField("age");
//        ageField.set(st,18);
//        Field nameField = clazz.getField("name");
//        System.out.println(nameField.getClass());
//        nameField.set(st,"Lily");
        System.out.println(st);




    }

}
