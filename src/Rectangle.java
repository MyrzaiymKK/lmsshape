public class Rectangle extends Shape{


    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public void getPerimeter() {
        int n = a * b;
        System.out.println("dlina pryamaugolnica: "+n);
    }
}
