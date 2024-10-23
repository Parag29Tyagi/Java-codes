import java.util.Scanner;

public class rec8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=2*n+1;
        pattern(row,n);
    }
    public static void star(int col)
    {
        if(col==0)
        return ;
        System.out.print("*");
        star(col-1);
    }
    
    public static void space(int col)
    {
        if(col==0)
        return ;
        System.out.print(" ");
        space(col-1);
    }
    public static void pattern(int row,int col)
    {
        if(row==0)
        return;
        if(row==(col*2+1)|| row%col==1 || row==col+1)
        {
            space(1);
            star(col-2);
            space(1);
        }
        else
        {
            star(1);
            space(col-2);
            star(1);
        }
        System.out.println();
        pattern(row-1,col);
    }
    
}
