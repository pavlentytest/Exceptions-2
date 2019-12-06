package ru.pavlenty;

public class Main {

    public static void main(String[] args)  {
      //  throw new NullPointerException("Null");


        try {
            Car.bbb();
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        /*try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Дальше...");
            int[] bb = {1,2};
            int m = bb[8];
        } catch(ArrayIndexOutOfBoundsException|ArithmeticException e) {
            System.out.println("Что-то плохое случилось:" + e.toString());
        }
         catch (Exception ddd) {
             System.out.println("Что-то плохое случилось:" + ddd.getMessage());
         } finally {
            System.out.println("Всегда!!!");
        }
        System.out.println("Что-то после...");
        */
    }
}
