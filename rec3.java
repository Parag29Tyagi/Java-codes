import java.util.Scanner;

public class rec3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,n);

    }    
    public static void star(int column)
    {
        if(column==0)
        return;
        System.out.print("*");
        star(column-1);
    }
    public static void pattern(int row,int column)
    {
        if(row==0)
        return;
        star(column-row+1);
        System.out.println();
        pattern(row-1,column);

    }
}
