package Array_test;

import java.lang.reflect.Array;

public class ReflectArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        //获取数组类型的Class 即int.class
        Class<?> clazz = array.getClass().getComponentType();
        System.out.println(clazz);
        //创建一个具有指定的组件类型和长度的新数组。
        //第一个参数:数组的类型,第二个参数:数组的长度
        Object newArr = Array.newInstance(clazz, 15);
        //获取原数组的长度
        int co = Array.getLength(array);
        //赋值原数组到新数组
        System.arraycopy(array, 0, newArr, 0, co);
        for (int i:(int[]) newArr) {
            System.out.print(i+",");
        }


    }
}
