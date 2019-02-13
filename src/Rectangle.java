public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

    public double getDiagonal(){
        double diagonal = Math.hypot(this.width, this.length);
        return diagonal;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public boolean isSquare() {
        boolean square = false;
        if(this.width == this.length){
            square = true;
        }
        return square;
    }

    @Override
    public String toString() {
        return "This rectangle has the area " + getArea() + " units squared and a diagonal of " + getDiagonal() + " units. " + "Is this rectangle a square? " +isSquare();
    }
}
