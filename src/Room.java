public class Room extends Shape{
    public Room(int a, int b) {
        super(a, b);
    }

    @Override
    public void getPerimeter() {
        int n = a*b+a*b;
        System.out.println(n);
    }
}
