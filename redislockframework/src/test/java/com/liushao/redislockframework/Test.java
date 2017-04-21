package com.liushao.redislockframework;

import java.lang.reflect.Field;

/**
 * Created by hxy on 2017/4/21.
 */
public class Test {
    public static void main(String[]args) throws NoSuchFieldException {
        Field field = Goods.class.getDeclaredField("arg2");
        System.out.print(field.getName());
    }
}
