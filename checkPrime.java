public class checkPrime {
public static void main(String[] args){
int n= 0;
for (int i = 0; i < 10; i++) {
    System.out.println(i + " " + isPrime(i, 2));
}
}
static boolean isPrime(int n, int i){
    if(n<=1){
        return false;
    }
    int c = 2;
    while(c*c<=n){
        if(n%c==0)
        {
            return false;
        }
        c++;
    }
    return true;
}
}
