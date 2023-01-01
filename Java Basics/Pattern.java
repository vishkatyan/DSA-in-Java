public class Pattern {
    public static void main(String[] args) {
        // Pattern 1
        // *****
        // *****
        // *****
        // *****
        // *****
        // for(int i=0; i<5;i++){
        //     for(int j=0; j<5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pattern2
        // *
        // **
        // ***
        // ****
        // *****
    //     for(int i=0; i<5;i++){
    //            for(int j=0; j<i+1; j++){
    //                System.out.print("*");
    //         }
    //            System.out.println();
    //         }
    // }
        // Pattern3
        // 1
        // 12
        // 123
        // 1234
        // 12345
    //     for(int i=0; i<5;i++){
    //            for(int j=0; j<i+1; j++){
    //                System.out.print(j+1);
    //         }
    //            System.out.println();
    //         }
    // }
   
    // Pattern 4
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    int k=0;
    for(int i=0; i<5;i++){
        for(int j=0; j<i+1; j++){
            k++;
            System.out.print(k +" ");
     }
        System.out.println();
     }

     // Reverse Pattern
     // Pattern 1
        // *****
        // ****
        // ***
        // **
        // *

        for(int i=0; i<5;i++){
            for(int j=0; j<5-i; j++){
                System.out.print("*");
         }
            System.out.println();
         }

     // Pattern 2
        // 54321
        // 5432
        // 543
        // 54
        // 5

        for(int i=0; i<5;i++){
            for(int j=5; j>i; j--){
                System.out.print(j);
         }
            System.out.println();
         }
 }


 


    }  
