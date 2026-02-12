import java.util.Scanner;
class Demo2
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num>0){{
            System.out.println("Number is positive");
        }
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }}
        else if(num<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}