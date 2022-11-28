import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int a=ch;
        System.out.println(a);
        sc.close();
    }
}