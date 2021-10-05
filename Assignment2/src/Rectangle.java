public class Rectangle extends Shape{
        private int width;
        private int height;

        public Rectangle(String name, String color, int width, int height){
            super(name, color);
            this.width = width;
            this.height = height;
        }

        public Rectangle(int width, int height){
            super(null,null);
            this.height = height;
            this.width = width;
        }

        public Rectangle(int side){
            super(null,null);
            this.height = side;
            this.width = side;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getPerimeter() {
            return 2 * (getWidth() + getHeight());
        }

        public int getArea() {
            return getHeight() * getWidth();
        }

        public String printShape() {
            return "The Rectangle has a " + getColor() + " color";
        }
}
