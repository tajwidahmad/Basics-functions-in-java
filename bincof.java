//this program finds the binary coeffient.
import java.util.*;
public class bincof {
    public static int fact(int n) {

        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
        
    }
    public static int bincoef(int n,int r) {
        int bincof=(fact(n))/fact(n-r);
        return bincof;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        System.out.println(bincoef(n, r));

    }
}
