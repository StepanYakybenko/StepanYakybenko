package lesson11;

public class Dog extends Animal {
    String name;
    static int countDog = 0;

    Dog(String name){
        super();
        countDog++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name+ " cannot to run more 500 m");
        } else {
            System.out.println(name+ " have run " + range + " m");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Dog cannot to swim more " +range+ " m");
        } else {
            System.out.println(name + " have swam " + range + " m");
        }
    }

    static int getCountDod (){
        return countDog;
    }
}
