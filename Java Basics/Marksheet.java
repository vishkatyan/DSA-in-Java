import java.util.Scanner;
public class Marksheet {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Name and Roll no");
        String name = scr.nextLine();
        int rollno = scr.nextInt();
        System.out.println("Enter subjects marks for chemistry, physics and maths");
        int chem = scr.nextInt();
        int phy = scr.nextInt();
        int maths = scr.nextInt();
        int total = chem+phy+maths;
        float per = total/3;
        if(per>=90){
            System.out.println("Grade A");
        }
        else if(per<90 && per >=70){
            System.out.println("Grade B");
        }
        else if(per<70 && per >=60){
            System.out.println("Grade C");
        }
        else if(per <60 && per >=50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }



    }
    
}
