import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        float a,b;
        float c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(float)(a*b);
        System.out.format("%.2f",c);
        sc.close();
    }
}