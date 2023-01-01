public class factorial {
    static void fact(int num, int result){
        // Processing logic

        // Termination
        if(num==0 || num==1){
            System.out.println(result);
            return;
        }
        fact(num-1,num*result);
        // Small Problem + cycle
    }
    public static void main(String[] args) {
        fact(5,1);

    }
}
