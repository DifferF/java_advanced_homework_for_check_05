package homework_05.task_04;

/*
Задание 4+
Создайте 2 класса, Animal и Cat.
В классе Animal инициализируйте 3 поля различных модификаторов.
В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей.
 */

import java.lang.reflect.Field;

public class Cat {

    public static void main(String[] args) {


        try {
            Class<?> cl = Animal.class;
            Animal animalO = new Animal();
            // По имени name получаем класс Field
            Field field_1 = cl.getDeclaredField("field_1");
            Field field_2 = cl.getDeclaredField("field_2");
            Field field_3 = cl.getDeclaredField("field_3");
            // true - снимаем модификатор до public, false - запрещаем
            field_1.setAccessible(true);
            field_2.setAccessible(true);
            // У класса Field, есть различные методы get
            System.out.println("field_1: " + field_1.getInt(animalO));
            field_1.setInt(animalO, 10);
            System.out.println(" - New field_1: " + field_1.getInt(animalO));
            System.out.println("______________________________");
            System.out.println("field_2 String: " + field_2.get(animalO));
            field_2.set(animalO, "String String String");
            System.out.println("- New field_2 String: " + field_2.get(animalO));
            System.out.println("______________________________");
            System.out.println("field_3: " + field_3.getInt(animalO));
            field_3.setInt(animalO, 333333);
            System.out.println(" - New field_3: " + field_3.getInt(animalO));


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
