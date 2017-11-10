package modelo;

public class Person {

    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void walk(){
        double newWeight = weight - 0.1;
        System.out.println("Person name: "+ name +"\nWeight before walk: "+ weight +"\nNew weight: "+ newWeight +"\n\n");
        this.weight = newWeight;

    }

    public void run(){
        double newWeight = weight - 0.3;
        System.out.println("Person name: "+ name +"\n Weight before run: "+ weight +"\nNew weight: "+ newWeight +"\n\n");
        this.weight = newWeight;

    }
    public void jump(){
        double newWeight = weight - 1;
        System.out.println("Person name: "+ name +"\n Weight before jump: "+ weight +"\nNew weight: "+ newWeight +"\n\n");
        this.weight = newWeight;
    }

}



