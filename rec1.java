import java.util.Scanner;

public class rec1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nrows(n, n);

    }
    public static void printstar(int n)
    {
        if(n==0)
        return;
        System.out.print("*");
        printstar(n-1);
    }
    public static void  nrows(int r,int c)
    {
        if(r==0)
        return ;
        printstar(c);
        System.out.println();
        nrows(r-1, c);
    }

    
}
