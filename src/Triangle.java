public class Triangle extends Shape{
    int s;
    public Triangle(int a, int b, int s) {
        super(a, b);
        this.s = s;
    }

    @Override
    public void getPerimeter() {
        int n = a*b*s;
        System.out.println("Triangle:"+n);
    }
}
