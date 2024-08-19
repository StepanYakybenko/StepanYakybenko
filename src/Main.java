public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsic", 20, false);
        Cat cat1 = new Cat("Bob", 30, false);


        Dog dog = new Dog("Tobik");
        Dog dog1 = new Dog("Jack");

        cat.run(200);
        cat.run(201);
        cat.swim(1);

        dog.run(500);
        dog.run(501);
        dog.swim(10);
        dog.swim(12);


        System.out.println("Total animals: " + Animal.getCountAnimal());
        System.out.println("Total cats: " + Cat.getCountCat());
        System.out.println("Total dogs: " + Dog.getCountDod());
        
    int action = 5;
    Cat[] allcat = new Cat[4];
    allcat[0]=new Cat("Рыжик",5, false);

    allcat[1]=new Cat("Васька",20, false);

    allcat[2]=new Cat("Мaрик",5, false);

    allcat[3]=new Cat("Жора",10, false);

        Bowl plate = new Bowl(45);
        plate.info();
        for (int i = 0; i < allcat.length; i++) {
            if (allcat[i].fullness == false && allcat[i].appetite < Bowl.food){
                allcat[i].eat(plate);
                allcat[i].fullness = true;
                System.out.println("Котик " + allcat[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allcat[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить еще в миску?");
        plate.increaseFood(action);
        plate.info();

    }
}
