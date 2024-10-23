import java.util.Scanner;

public class rec10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        upper(n,n*2);
        lower(1,n*2);

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
    public static void upper(int row,int col)
    {
        if(row==0)
        return ;
        star(row);
        space(col-(2*row));
        star(row);
        System.out.println();
        upper(row-1,col);
    }
    public static void lower(int row,int col)
    {
        if(row==(col/2)+1)
        return ;
        star(row);
        space(col-(2*row));
        star(row);
        System.out.println();
        lower(row+1,col);
    }
}
