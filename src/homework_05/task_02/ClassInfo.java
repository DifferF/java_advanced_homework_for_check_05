package homework_05.task_02;

/*
Задание 2
Напишите программу, которая будет выводить всю информацию о классе,
пользователь сам выбирает, какой именно класс интересует.
 */

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassInfo {

    public static void main(String[] args) {

        Scanner scner = new Scanner(System.in);
        System.out.println(" Введите ккласс ");

        String nameClass = scner.next();

        Class<?> cl;
        switch (nameClass){
            case ("String"):
            cl = String.class;
            break;

            case ("ArrayList"):
                cl = ArrayList.class;
                break;

            case ("Method"):
                cl = Method.class;
                break;
            default:
                throw new IllegalStateException("Invalid" + nameClass);
        }

        System.out.println();
        System.out.println("Ifo about this class " + nameClass);

        System.out.println("Is Array " + cl.isArray());
        System.out.println("Interfaces " + Arrays.toString(cl.getInterfaces()));
        System.out.println("Superclass " + cl.getSuperclass());
        System.out.println("Modification " + cl.getModifiers());
        System.out.println("Constructors " + Arrays.toString(cl.getConstructors()));
        System.out.println("Package Name " + cl.getPackageName());
        System.out.println("Methods " + Arrays.toString(cl.getMethods()));

    }


}
