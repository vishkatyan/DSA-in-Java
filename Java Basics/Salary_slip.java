import java.util.Scanner;
public class Salary_slip{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scr.nextLine();
        System.out.println("Enter your employee id");
        int id = scr.nextInt();
        System.out.println("Enter your basic salary");
        float salary = scr.nextFloat();
        float hra = (salary*50)/100;
        System.out.println("HRA(50% of basic salary)"+hra);
        float da = (salary*10)/100;
        System.out.println("DA(10% of basic salary)"+da);
        float ta = (salary*40)/100;
        System.out.println("TA(40% of basic salary)"+ta);
        float ma = (salary*30)/100;
        System.out.println("MA(30% of basic salary)"+ma);
        float pf = (salary*5)/100;
        System.out.println("PF(10% of basic salary)"+pf);
        float gs = salary+da+ta+ma;
        System.out.println("GS is: "+gs);
        float tax = (gs*10)/100;
        System.out.println("tax is: "+tax);
        float ns = gs-pf-tax;
        System.out.println("NS is: "+ns);

    }
}