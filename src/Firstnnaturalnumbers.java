import java.util.*;
public class Firstnnaturalnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("First'n'natural numbers:"+sum);

    }
}
