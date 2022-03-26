public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, String color, double length) {
        super(radius, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume(){
        return getArea()*length;
    }

    @Override
    public String toString() {
        return super.toString()+" Cylinder length "+length+" has volume : "+getVolume();
    }
}
