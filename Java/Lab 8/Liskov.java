import java.lang.*;

interface IPerson {
    public void eat();
}

class MeatEater implements IPerson {
    public void eat() {
        System.out.println("I Love Steak!!!");
    }
}

class VeggieEater implements IPerson {
    public void eat() {
        System.out.println("I love lettuce!!!");
    }
}