public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car Car) {
        super(Car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
