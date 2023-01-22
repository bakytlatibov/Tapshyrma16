public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};




        for (Animal animal : animals) {
            if (animal.getClass().getName().equals("Shark")) {
                ((Shark)animal).eat();
                ((Shark) animal).attack();
            }
             else if (animal.getClass().getName().equals("Turtle")) {
                ((Turtle)animal).eat();
                ((Turtle)animal).swim();

            }
            else if (animal.getClass().getName().equals("Eagle")) {
                ((Eagle)animal).eat();
                ((Eagle)animal).fly();
            }}{}



        for (Animal a:animals) {
            if (a instanceof Shark){
                ((Shark)a).eat();
                ((Shark) a).attack();
            }
            else if (a instanceof Turtle) {
                ((Turtle)a).eat();
                ((Turtle)a).swim();

            }
            else if(a instanceof Eagle){
                ((Eagle)a).eat();
                ((Eagle)a).fly();

            }

        }
    }}
