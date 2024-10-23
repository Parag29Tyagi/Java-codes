import java.util.Scanner;

public class rec9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=2*n+1;
        int col=row;
        upperpattern(0, col,n);
        midstar(row, col, n);
        System.out.println();
        lowerpattern(n, col-(n-1), n);


    }
    public static void star(int n)
    {
        if(n==0)
        return;
        System.out.print("*");
        star(n-1);
    }
    public static void space(int col)
    {
        if(col==0)
        return;
        System.out.print(" ");
        space(col-1);
    }
    public static void upperpattern(int row,int col,int n)
    {
        if(row==n)
        return;
        space(row);
        star(1);
        space(col-row-2);
        star(1);
        System.out.println();
        upperpattern(row+1, col-1, n);

        
    }
    public static void lowerpattern(int row,int col,int n)
    {
        if(row==0)
        return;
        space(row-1);
        star(1);
        space(col-row-1);
        star(1);
        System.out.println();
        lowerpattern(row-1, col+1, n);

        
    }
    public static void midstar(int row,int col,int n)
    {
        space(n);
        star(1);

    }

    
}
