package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> items = new HashMap<>();

    public void add(String surname, String phoneNumber) {

        if (items.get(surname) != null) {
            if (!items.get(surname).contains(phoneNumber)) {
                items.get(surname).add(phoneNumber);
            }
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(phoneNumber);
            items.put(surname, arr);
        }
    }

    public void get(String surname) {
        String format = "|%1$-20.18s| контактный телефон(ы): ";
        System.out.format(format, surname);
        System.out.println(items.get(surname));
    }

    public static void main(String[] args) {
        PhoneBook pB = new PhoneBook();
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

