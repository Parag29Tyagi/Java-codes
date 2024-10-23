import java.util.Scanner;

public class rec5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int col=2*n-1;
        pattern(n,col);
    }
    public static void star(int col)
    {
        if(col==0)
        return;
        System.out.print("*");
        star(col-1);

    }
    public static void space(int col)
    {
        if(col==0)
        return;
        System.out.print(" ");
        space(col-1);
        
    }
    public static void pattern(int row,int col)
    {
        if(col<row)
        return;
        space(col-row);
        star(row);
        System.out.println();
        pattern(row,col-1);

    }
    
}
