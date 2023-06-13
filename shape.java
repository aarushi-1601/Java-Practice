public class shape
{
    private int length;
    private int breadth;

    shape()
    {
        length = 10;
        breadth = 2;
    }

    shape(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return(length*breadth);
    }

    int volume()
    {
        return(length * length * length); // Calculating volume only for cube shape.
    }

    public static void main(String args[])
    {
        shape s = new shape();
        shape s1 = new shape(2,5);
        System.out.println(s.area());
        System.out.println(s.volume());
        System.out.println(s1.area());
        System.out.println(s1.volume());
    }
}