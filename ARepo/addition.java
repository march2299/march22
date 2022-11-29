class methodover 
{
    void disp(int a,int b)
    {
        int x=a,y=b;
        int z=x+y;
        System.out.println("Addition="+z);
    }
    void disp(int a,float b)
    {
        int x=a;float y=b;
        float z=x*y;
        System.out.println("Multiplication="+z);
    }
    void disp(int a)
    {
        int y=20;
        int x=a;
        int z=x+y;
        System.out.println("Addition="+z);
    }
    
}
public class addition{
    public static void main(String[] args) {
        methodover ob=new methodover();
        ob.disp(10,20);
        ob.disp(5,12.0f);
        ob.disp(10);
    }
}

