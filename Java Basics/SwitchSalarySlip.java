import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;
public class SwitchSalarySlip {
    public static void main(String[] args) {
        final int MONTHS = 12;
        float tax = 0.0f;
        
        System.out.println("Enter your basic salary");
        Scanner scr = new Scanner(System.in);
        int salary = scr.nextInt();
        float hra = salary*0.50f;
        float da = salary*0.15f;
        float ta = salary*0.40f;
        float ma = salary*0.25f;
        float pf = salary*0.10f;
        float gs = salary+hra+ta+ma;
        float annualSalary = gs*MONTHS;
        scr.close();
        if(annualSalary>=500000 && annualSalary<800000){
            tax = 0.10f;
        }
        else if(annualSalary>=800000 && annualSalary<1000000){
            tax = 0.20f;
        }
        else if(annualSalary>=1000000){
            tax = 0.30f;
        }
        if(tax>0){
            tax = gs*tax;
        }
        float netSalary= gs-tax-pf;
        // Number Formatting
        //getInstance will put comma but currrency instance will make understand where does it put.
        //NumberFormat form= NumberFormat.getInstance();
        // dateformat class will show date region wise, messageformat will convert language to different language.
        // for spaces---> \t
        Locale locale = new Locale("fr","FR");
        NumberFormat form= NumberFormat.getCurrencyInstance();

        System.out.println("*********Salary Slip********");
        System.out.println("Basic Salary " +form.format(salary));
        System.out.println("HRA " +hra);
        System.out.println("DA " +da);
        System.out.println("TA " +ta);
        System.out.println("MA " +ma);
        System.out.println("PF " +pf);
        System.out.println("GS " +gs);
        System.out.println("Annual Salary " +annualSalary);
        System.out.println("Net Salary " +netSalary);
        
    
    }
    
}
