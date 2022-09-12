package homework_05.task_03;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/*
Задание 3+
Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа.
 */
public class Main {

    public class TestClassMethods {

        private String field_1 = "field_1 TestClassMethods";
        private int field_2 = 5;
        private long field_3 = 30;
        private int field_4 = 88;


        public TestClassMethods(String field_1, int field_2, long field_3, int field_4) {
            this.field_1 = field_1;
            this.field_2 = field_2;
            this.field_3 = field_3;
            this.field_4 = field_4;
        }


        public String getField_1() {
            return field_1;
        }

        public int getField_2() {
            return field_2;
        }

        public long getField_3() {
            return field_3;
        }

        public int getField_4() {
            return field_4;
        }

        public void setField_1(String field_1) {
            this.field_1 = field_1;
        }

        public void setField_2(int field_2) {
            this.field_2 = field_2;
        }

        public void setField_3(long field_3) {
            this.field_3 = field_3;
        }

        public void setField_4(int field_4) {
            this.field_4 = field_4;
        }

        @Override
        public String toString() {
            return "TestClassMethods{" +
                    "field_1='" + field_1 + '\'' +
                    ", field_2=" + field_2 +
                    ", field_3=" + field_3 +
                    ", field_4=" + field_4 +
                    '}';
        }

    }

        public static void main(String[] args) {
            String s = (char) 27 + "[31m";
            String s1 = (char) 27 + "[39m";
            String s2 = (char) 27 + "[34m";
            // Получаем класс который описывает класс CatMethods
            Class<?> cl = TestClassMethods.class;

            System.out.println(s + "Constructors:" + s1);
            // Получаем массив конструкторов
            Constructor[] constructors = cl.getConstructors();

            for (Constructor ctr : constructors) {
                // Выводим типы параметров каждого конструктора(кроме без параметров)
                Class[] paramTypes = ctr.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }

            Method[] methods = cl.getMethods();
            for (Method method : methods) {
                System.out.println(s + "Name: " + s2 + method.getName());
                System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
                Class[] paramTypes = method.getParameterTypes();
                System.out.print(s + "\tParam types:" + s1);
                for (Class<?> paramType : paramTypes) {
                    System.out.print(" " + paramType.getName());
                }
                System.out.println();
            }

            Class cl11 = TestClassMethods.class;
            System.out.println(s + "Class name: " + s1 + cl11.getName());
            System.out.print(s + "Modifiers of class: " + s1);
            // getModifiers(), возвращает целочисленное значение
            int mods = cl11.getModifiers();
            System.out.println(mods);

            if (Modifier.isPrivate(mods))
                System.out.print("private ");
            if (Modifier.isAbstract(mods))
                System.out.print("abstract ");
            if (Modifier.isFinal(mods))
                System.out.print("final ");


        }

    }



