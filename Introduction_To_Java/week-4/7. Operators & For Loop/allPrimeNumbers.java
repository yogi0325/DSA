import java.util.Scanner;

public class allPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int number =sc.nextInt();

        for(int i = 2 ; i <= number ; i++){
            boolean isPrime = true;
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
                }
                if(isPrime){
                    System.out.println(i);
            }
             
        }
        
}
}