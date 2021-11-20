public class CarDecorator implements Car{
    public Car basicCar;

    public CarDecorator(Car Car){
        basicCar = Car;
    }
    @Override
    public void assemble() {
        basicCar.assemble();
    }
}
