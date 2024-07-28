import java.util.Arrays;

public class Lesson1 {
    public static void printTreeWords() {
        String s1 = "Orange";
        String s2 = "Banana";
        String s3 = "Apple";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static void checkSumSing() {
        int a = -7;
        int b = 8;
        int c = a+b;
        if (c>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 100;
        if (value<=0) {
            System.out.println("Красный");
        }
        else if (value>0) {
                System.out.println("Желтый");
            }
        else if (value>100) {
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers() {
    int a = 3;
    int b = 5;
    if (a>=b) {
        System.out.println("a>=b");
    }
    else {
            System.out.println("a<b");
        }
    }
    public static void compareNumber() {
        compareNumber(7,14);
    }
    public static void compareNumber(int p, int s) {
        if (p+s<10) {
            System.out.println();
        }
        else if (p+s<=20) {
            System.out.println("true");
        } else if (p+s>20) {
            System.out.println("false");
        }
    }

    public static void method() {
        method(-1);
    }

    public static void method(int a) {
        if (a>=0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }

    }
    public static void meth() {
        meth(-1);
    }

    public static void meth(int w) {
        boolean z = w<0;
        boolean x = w>=0;
        if (z) {
            System.out.println("True");
        }
        else if (x) {
            System.out.println("False");
        }
    }

    public static void printS() {
        String s = "Hello";
        int a = 1;
        while(a<=5) {
            System.out.println(s);
            a = a+1;
        }
    }

    public static void division() {
      int year = 2024;
      if (year % 400 == 0) {
          System.out.println(true);
      }
      else if (year % 100 == 0) {
          System.out.println(false);
      }
      else if (year % 4 ==0) {
            System.out.println(true);
        }
      else {
          System.out.println(false);
      }
    }

    public static void array() {
        int [] numbers = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++)
        numbers[i] = 1 - numbers[i];
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrays() {
        int couter = 1;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = couter;
            {
                System.out.println(arr[i] + " ");
                couter++;
            }
        }

    }

    public static int[] changeArr() {
        int[] number = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++)
        if (number[i] < 6)
            number[i] *= 2;
        System.out.println(Arrays.toString(number));
        return number;
    }

    public static void createDiagonal() {
        int [][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            //arr[i][i] = 1;
            //arr[i] [5 - i -1] = 1;
            for (int j = 0, x = arr[i].length-1; j < arr[i].length; j++, x--) {
              if (i == j || i == x) arr [i][j] = 1;
              else arr[i][j] = 0;
                System.out.println(arr[i][j] + "");
            }
            System.out.println("\n");
        }
        //System.out.println(Arrays.deepToString(arr));
        //for (int i =0; i<5; i++)
        //System.out.println(Arrays.toString (arr[i]));
    }

    public static void lTask () {
        lTask (5,2);
    }
    public static void lTask(int len, int initialValue){
        int[] arr = new int[len];
        for (int i= 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i +"]" + arr[i] + " ");
        }

    }






        public static void main (String[]args){
            printTreeWords();
            checkSumSing();
            printColor();
            compareNumbers();
            compareNumber();
            method();
            meth();
            printS();
            division();
            array();
            arrays();
            changeArr();
            createDiagonal();
            lTask();
        }

    }