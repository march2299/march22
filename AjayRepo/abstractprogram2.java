abstract class shape
{
    abstract void draw();
}
class rectangle extends shape{
    void draw()
    {
        System.out.println("Reactangle");
    }
}
class circle extends shape{
    void draw()
    {
        System.out.println("Circle");
    }
}
public class abstractprogram2 {
    public static void main(String[] args) {
        shape ob=new circle();
        //shape ob1=new rectangle();
        ob.draw();
        //ob1.draw();
    }
}
