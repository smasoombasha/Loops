import java.util.*;

public class AllLoops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Forloop
        int i=1;
        for(i=1;i<=n;i=i+1){
            System.out.println("I variable "+i );

        }

        //While loop
        int j=1;
        while(j<=n){
            System.out.println("J variable: "+j);
            j++;
        }
        //dowhile loop
        int k=1;
        do{
            System.out.println("K variable: "+k);
            k++;
        }while(k<=n);
    }
}

