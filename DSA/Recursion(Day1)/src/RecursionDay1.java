public class RecursionDay1 {

//    static void show(int num){ // num variable is local variable
//        if(num>5){
//            return;   // stop function conditionally
//        }
//        System.out.println("Vishakha");
//        show(num+1); //cycle
//    }
    static void printValue(int num){
        //Termination condition
        if(num==0)
        {
            return;
        }

        // Small problem in cycle
        // Stack build space
        printValue(num-1); //Tail recursion --> fastest recursion in destruction or stack fall
        //Processing Logic
        // Stack fall space
        System.out.println(num);
    }

    public static void main(String[] args) {
//        show(1);
        printValue(10);
    }
}
