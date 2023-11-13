public class Square extends Shape{
    public Square(int a, int b) {
        super(a, b);
    }

    @Override
    public void getPerimeter() {
        int n = (a*b)*2;
        System.out.println("Square:"+n);
    }
}
