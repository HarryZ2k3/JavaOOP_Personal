package LA3_Q1;
public class Main_LA3
{
    public static void main(String[] args)
    {
        MyShape r1 = new MyShape(2, 3, 7, 5);
        MyShape r2 = new MyShape(3, 4, 8, 4);
        MyShape r3 = new MyBoundedShape(4, 5, 9, 3);
        MyShape r4 = new MyShape(5, 6, 10, 2);
        MyShape r5 = new MyShape(6, 7, 11, 7);
        r1.Draw();
        r2.Draw();
        r3.Draw();
        r4.Draw();
        r5.Draw();
        r1.getArea();
    }
}