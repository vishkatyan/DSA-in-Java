public class OptimisedPrimeNumber {
    public static void main(String[] args) {

        // Prime number basic solution
//        int num =17;
//        int count=0;
//        boolean prime = true;
//        for(int i=2;i<num;i++){
//            count++;
//            if(num%i==0){
//                prime = false;
//                break;
//            }
//        }
//        System.out.println(count);
//        if(prime){
//            System.out.println("number is prime");
//        }
//        else{
//            System.out.println("No is not prime");
//        }

        //Optimised Approach
//        int num =17;
//        int count=0;
//        boolean prime = true;
//        for(int i=2;i<num/2;i++){
//            count++;
//            if(num%i==0){
//                prime = false;
//                break;
//            }
//        }
//        System.out.println(count);
//        if(prime){
//            System.out.println("number is prime");
//        }
//        else{
//            System.out.println("No is not prime");
//        }


        //More Optimised Approach by Square Root
//        int num =997;
//        int count=0;
//        boolean prime = true;
//        for(int i=2; i*i<num; i++){ // check till its square root so here we did i*i...square of i
//            count++;
//            if(num%i==0){
//                prime = false;
//                break;
//            }
//        }
//        System.out.println(count);
//        if(prime){
//            System.out.println("number is prime");
//        }
//        else{
//            System.out.println("No is not prime");
//        }

        // the optimised approqch
        int num =997;
        int count=0;
        boolean prime = true;
        if(num%2 ==0 || num%3==0){
            prime = false;
        }
        for(int i=5; i*i<num; i+=6){ // check till its square root so here we did i*i...square of i
            count++;
            if(num%i==0 || num %(i+2)==0){
                prime = false;
                break;
            }
        }
        System.out.println(count);
        if(prime){
            System.out.println("number is prime");
        }
        else{
            System.out.println("No is not prime");
        }
    }
}
