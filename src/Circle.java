public class Circle {
    protected double radius ;
    private String color ;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius "+ radius+ " has area : " + getArea()+ " and has color : "+ color ;
    }
}
