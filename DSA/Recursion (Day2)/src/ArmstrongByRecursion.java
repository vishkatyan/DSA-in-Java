public class ArmstrongByRecursion {
    static boolean isArmStrongNumber(int original, int compute,int copy){
        if(original==0) {
            if (compute == copy) {
                return true;
            }
            return false;
        }
        int single = original%10;
        compute = compute + single*single*single;
        return isArmStrongNumber(original/10, compute,copy);
    }
    public static void main(String[] args) {
        int num=153;
        boolean result = isArmStrongNumber(num,0,num);
        if(result){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong no");
        }


    }
}
