public class Square extends Shape{
    private int side;

    public Square(int side){
        super(null,null);
        this.side = side;
    }

    public Square(String name, String color, int side){
        super(name,color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public int getArea() {
        return side * side;
    }

    public String printShape(){
        return "The Square has a " + getColor() + " color";
    }
}
