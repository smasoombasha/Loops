import java.util.*;
public class Studentmarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        // menu driven program to enter either 1or0 to enter know Grade by entering marks of students
        do{
            int marks= sc.nextInt();
            if(marks >=90 && marks<=100){
                System.out.println("AGrade");
            }
            else if(marks>=70 && marks<=89){
                System.out.println("BGrade");
            }
else if (marks>=50 && marks<=69){
                System.out.println("CGrade");
            }else if (marks>=45 && marks<=49){
                System.out.println("Pass");
            }

            else {
                System.out.println("invaid");
            }
            System.out.println("Want to continue if Yes(1) or No(0)");
            input= sc.nextInt();
        }while(input==1);
    }
}

