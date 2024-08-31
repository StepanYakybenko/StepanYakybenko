package lesson13;

import collections.PhoneBook;
public class main {
    public static void main(String[] args) {
        collections.PhoneBook pB = new PhoneBook();
        System.out.println("Телефонный справочник");
        pB.add("Петров", "+375 (29) 714-11-00");
        pB.add("Иванов", "+375 (29) 715-22-11");
        pB.add("Петров", "+375 (29) 716-33-22");
        pB.add("Сидоров", "+375 (29) 718-44-33");
        pB.add("Андреев", "+375 (29) 719-55-44");
        pB.add("Петров", "+375 (29) 720-66-55");
        pB.add("Иванов", "+375 (29) 721-77-66");
        pB.add("Петров", "+375 (29) 722-88-77");
        pB.get("Петров");
        pB.get("Иванов");
        pB.get("Сидоров");
    }
}

