public class Boat extends Vehicule{
    //attributes

    //constructors
    public Boat(String name, int kilometers ) {
        super(name, kilometers);
    }

    //methods
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fait glou glou!";
    }
}
