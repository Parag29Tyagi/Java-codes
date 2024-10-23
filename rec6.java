import java.util.Scanner;

public class rec6 {
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
public static void space(int col)
{
    if(col<=0)
    return;
    System.out.print(" ");
    space(col-1);
    
}
public static void pattern(int row,int col)
    {
        if(col>(2*row-1))
        return;
        space(col-row);
        star(row);
        System.out.println();
        pattern(row,col+1);

    }
}
