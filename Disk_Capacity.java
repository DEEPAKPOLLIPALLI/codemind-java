import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        n=a*b*c*512*2;
        System.out.println(n);
        sc.close();
    }
}