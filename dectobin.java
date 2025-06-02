public class dectobin {
    public static void decimaltobinary(int n) {
        int decimal=n;
        int bin=0;
        int pow=0;
        while(n>0){
            int rem =n%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;


        }
        System.out.println("the binary of "+decimal+"= "+bin);
    }
    public static void main(String[] args) {
        decimaltobinary(7);
    }
}
