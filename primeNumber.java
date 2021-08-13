import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println("Number is neither prime nor composite");
        }
        int c=2;
        boolean is=true;
        if(num==4){
            System.out.println("Its not a prime number");
        }else{
            while (c*c<num){
                if(num%c==0){
                    is=false;
                    return;
                }
                c++;
            }
        }
        if(is){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
