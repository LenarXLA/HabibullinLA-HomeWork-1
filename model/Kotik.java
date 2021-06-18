package homeWork_1.model;

public class Kotik {
    private int prettiness;
    private int weight;
    private int levelOfEnergy;
    private static int numberOfCats;
    private String name;
    private String meow;

    public Kotik() {
        ++numberOfCats;
    }

    public Kotik(int prettiness, int weight, String name, String meow, int levelOfEnergy) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.levelOfEnergy = levelOfEnergy;
        ++numberOfCats;
    }

    public void setKotik(int prettiness, String name, int weight, String meow, int levelOfEnergy) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.levelOfEnergy = levelOfEnergy;
    }

    public int getPrettiness() {
        return this.prettiness;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getLevelOfEnergy() {
        return this.levelOfEnergy;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    public String getName() {
        return this.name;
    }

    public String getMeow() {
        return this.meow;
    }

    public boolean play() {
        if (this.levelOfEnergy <= 0) {
            return false;
        } else {
            System.out.println("Cats playing!");
            --this.levelOfEnergy;
            return true;
        }
    }

    public boolean sleep() {
        if (this.levelOfEnergy <= 0) {
            return false;
        } else {
            System.out.println("Cats sleeping!");
            --this.levelOfEnergy;
            return true;
        }
    }

    public boolean chaseMouse() {
        if (this.levelOfEnergy <= 0) {
            return false;
        } else {
            System.out.println("Cats catch mouse!");
            --this.levelOfEnergy;
            return true;
        }
    }

    public boolean purring() {
        if (this.levelOfEnergy <= 0) {
            return false;
        } else {
            System.out.println("Cats purring!");
            --this.levelOfEnergy;
            return true;
        }
    }

    public boolean running() {
        if (this.levelOfEnergy <= 0) {
            return false;
        } else {
            System.out.println("Cats running!");
            --this.levelOfEnergy;
            return true;
        }
    }

    public void eat(int food) {
        System.out.println("Cats eating!");
        this.levelOfEnergy += food;
    }

    public void eat(int food, String nameOfFood) {
        System.out.println("Cats eating " + nameOfFood + "!");
        this.levelOfEnergy += food;
    }

    public void eat() {
        this.eat(1, "fish");
    }

    public void liveAnotherDay() {
        int randomNum;

        for(int i = 0; i < 24; ++i) {
            System.out.println("------------------------------");
            System.out.println("Время " + (i + 1));
            System.out.println("Сытость: " + this.levelOfEnergy);

            randomNum = (int)(Math.random() * 5 + 1);

            switch(randomNum) {
                case 1:
                    if (!this.play()) {
                        this.eat(2, "cheese");
                    }
                    break;
                case 2:
                    if (!this.sleep()) {
                        this.eat();
                    }
                    break;
                case 3:
                    if (!this.chaseMouse()) {
                        this.eat(3);
                    }
                    break;
                case 4:
                    if (!this.purring()) {
                        this.eat(1, "meat");
                    }
                    break;
                case 5:
                    if (!this.running()) {
                        this.eat();
                    }
            }
        }

    }
}
