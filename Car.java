public class Car extends Vehicule {

    //attributes

    //constructors
    public Car(String name, int kilometers ) {
        super(name, kilometers);
    }

    //methods
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fait vroum vroum!";
    }
    
}
