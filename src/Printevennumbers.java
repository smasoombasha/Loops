import java.util.*;
public class Printevennumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        System.out.println("-:Even numbers:-");
        for(i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
