public class Hangar {
    public static void main(String[] args) {

        //Car
        Car clio = new Car("une Clio", 5210);
        System.out.println(clio.doStuff());

        //Boat
        Boat catamaran = new Boat("un Catamaran",21008);
        System.out.println(catamaran.doStuff());
    }
}
