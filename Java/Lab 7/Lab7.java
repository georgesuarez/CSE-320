abstract class Traits {
    abstract String name();

    abstract int age();

    abstract double weight();

    abstract double height();
}

class Animal extends Traits {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Animal(String _name, int _age, double _weight, double _height) {
        name = _name;
        age = _age;
        weight = _weight;
        height = _height;
    }

    String name() {
        return name;
    }

    int age() {
        return age;
    }

    double weight() {
        return weight;
    }

    double height() {
        return height;
    }
}

class DogOwner extends Traits {
    private String name;
    private int age;
    private double weight;
    private double height;

    public DogOwner(String _name, int _age, double _weight, double _height) {
        name = _name;
        age = _age;
        weight = _weight;
        height = _height;
    }

    String name() {
        return name;
    }

    int age() {
        return age;
    }

    double weight() {
        return weight;
    }

    double height() {
        return height;
    }
}

class Legs {
}

class Dolphin extends Animal {
    public Dolphin(String _name, int _age, double _height, double _weight) {
        super(_name, _age, _height, _weight);
    }
}

class Dog extends Animal {

    private Legs legs;

    public Dog(String _name, int _age, double _weight, double _height) {
        super(_name, _age, _weight, _height);
    }

}

class DogInfoPrinter {
    public void dogInfoPrinter(Dog d) {
        System.out.println("Dog name: " + d.name());
        System.out.println("Age (in human yrs): " + d.age());
        System.out.println("Weight (in lbs): " + d.weight());
        System.out.println("Height (in inches): " + d.height() + "\n");
    }
}

class DogOwnerInfoPrinter {
    public void dogOwnerPrinter(DogOwner d) {
        System.out.println("Dog Owner's name: " + d.name());
        System.out.println("Age: " + d.age());
        System.out.println("Weight (in lbs): " + d.weight());
        System.out.println("Height (in inches): " + d.height() + "\n");
    }
}

class Lab7 {
    public static void main(String[] args) {
        DogInfoPrinter info = new DogInfoPrinter();
        DogOwnerInfoPrinter dogOwnerInfo = new DogOwnerInfoPrinter();

        DogOwner dogOwner = new DogOwner("George Suarez", 23, 220.5, 75.0);
        Dog d = new Dog("Shorty", 15, 7.0, 6.2);
          
        dogOwnerInfo.dogOwnerPrinter(dogOwner);
        info.dogInfoPrinter(d);
    }
}