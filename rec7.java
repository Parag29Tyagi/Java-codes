import java.util.Scanner;

public class rec7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern((2*n+1),(2*n+1),n);


    }
    public static void plus(int n)
    {
        if(n==0)
        return;
        System.out.print("+");
        plus(n-1);
    }
    public static void space(int n)
    {
        if(n==0)
        return;
        System.out.print(" ");
        space(n-1);
    }
    public static void pattern(int row,int col,int n)
    {
        if(row==0)
        return;
        if(row==(n+1))
        plus(col);
        else
        {
            space(n);
            plus(1);
            space(n);
        }
        System.out.println();
        pattern(row-1,col,n);
    }
    
}
