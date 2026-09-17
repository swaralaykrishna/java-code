import java.util.Scanner;
public class PalindromeRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end=sc.nextInt();
        System.out.println("Palindrome numbers between" +start+ "and" +end+":" );
            for(int num=start;num<=end;num++){
                int temp=num;
                int reverse=0;
                while(temp!=0){
                    int digit=temp%10;
                    reverse=reverse*10+digit;
                    temp=temp/10;
                
                }
                if(reverse==num){
                    System.out.println(num);
                }
            }
            sc.close();
    }
}