public class prime {
    public static int checkprime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return -1; //not prime 
            }
        }
        return 1;//if prime
    }
    public static void main(String[] args) {
        if(checkprime(5)==1){
            System.out.println("prime");
        }
    }
    
}
