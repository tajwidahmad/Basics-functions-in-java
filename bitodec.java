public class bitodec {
    //this program is to convert binary number to decimal number let 101
    public static void binarytodecimal(int bin) {
        int decimal =0;
        int pow =0;
        int binnary=bin;
        
        while (bin>0) {
            int lastdigit = bin%10;
            decimal = decimal+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            bin=bin/10;
        }
        System.out.println("the decimal of "+binnary+"="+decimal);
        
    }
    public static void main(String[] args) {
        binarytodecimal(101);
    }
}

