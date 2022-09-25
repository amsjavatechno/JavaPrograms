package Programs;

public class AramStrongGenerator {
    public static int noOfDigits(int Number) {
        int count  = 0;
        if(Number==0){
            return 1;
        }
        while (Number>0) {
            Number = Number /10;
            count++;
        }
        return count;
    }

    public static boolean isArm(int n) {
        int power = noOfDigits(n);
        int ans = 0;
        int original = n;
        while(n>0){
            int rem = n %10;
            ans = ans+(int)Math.pow(rem,power);
            n = n/10;
        }
        if(ans==original){
            // System.out.println("Yes");
            return true;
        }
            // System.out.println("No");
            return false;
    } 

    public static void main(String[] args) {
        // int x = 1000000000;
        int i = 0;
        int count = 0;
        while(count<30){
            if(isArm(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
}
