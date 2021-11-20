public class SportsCar extends CarDecorator{
    public SportsCar(Car Car) {
       super(Car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
