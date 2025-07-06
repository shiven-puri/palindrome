import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int org,rev=0;
        org=num;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org==rev){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}
