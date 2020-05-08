import java.util.Scanner;
import java.util.*;
public class PrimeNo {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=0;
        boolean isPrime=false;
        System.out.println("Please insert any number  ");
        n=scan.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=true;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+ " is not a prime number. ");
        }
        else{
            System.out.println(n+" is prime number. ");
        }
    }
    
}