import java.util.Scanner;

public class rec4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,n);

    }
    public static void star(int col)
    {
        if(col==0)
        return;
        System.out.print("*");
        star(col-1);
    }
    public static void pattern(int row,int col)
    {
        if(row==0)
        return;
        star(row);
        System.out.println();
        pattern(row-1,col);

    }
    
}
