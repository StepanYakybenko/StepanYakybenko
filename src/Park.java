public class Park {
    private String name;
    private String location;
    private int nAttraction;

    public Park(String name, String location, int nAttraction) {
        this.name = name;
        this.location = location;
        this.nAttraction = nAttraction;
    }

    public class Attraction {
        private String nameAttraction;
        private String timeAttraction;
        private int costAttraction;

        public Attraction(String nameAttraction, String timeAttraction, int costAttraction) {
            this.nameAttraction = nameAttraction;
            this.timeAttraction = timeAttraction;
            this.costAttraction = costAttraction;
        }

        public void printInfo() {
            System.out.println("nameAttraction: " + nameAttraction);
            System.out.println("timeAttraction: " + timeAttraction);
            System.out.println("costAttraction: " + costAttraction + " euro");
        }
    }

    public static void main(String[] args) {
        Park intertaiment = new Park("Dino", "Side", 5);
        Park.Attraction attraction1 = intertaiment.new Attraction("Wave", "09:00 - 18:00", 5);
        Park.Attraction attraction2 = intertaiment.new Attraction("Woterfall", "09:00 - 17:00", 10);
        Park.Attraction attraction3 = intertaiment.new Attraction("Crazy river", "10:00 - 16:00", 7);
        Park.Attraction attraction4 = intertaiment.new Attraction("Islend", "8:00 - 19:00", 9);
        Park.Attraction attraction5 = intertaiment.new Attraction("Coaster", "11:00", 15);
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
        attraction4.printInfo();
        attraction5.printInfo();
    }
}


