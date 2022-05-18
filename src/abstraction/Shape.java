package abstraction;

 public abstract class Shape {
    abstract void area();


 }
class square extends Shape{
     private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void area(){
        System.out.println("length of the sides:"+side*side);
    }
}
class rectangle extends Shape {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("area of the rectangle:" + length * breadth);
    }

    public static void main(String[] args) {
        square sq = new square();
        sq.setSide(8);
        sq.area();
        rectangle r1 = new rectangle();
        r1.setLength(4);
        r1.setBreadth(5);
        r1.area();
    }
 }





