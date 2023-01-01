public class PyramidPrograms {
    public static void main(String[] args) {
        // Pattern1
        //      *
        //     * *
        //    * * *
        //   * * * *
        // * * * * * *

        for(int i=0; i<5;i++){
            for(int j =0;j < 5-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print("*");
         }
            System.out.println();
         }

         // Pattern2
        //      *
        //     ***
        //    *****
        //   *******
        // ***********

        // for(int i=0; i<5;i++){
        //     for(int j =0;j < 5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0; k<2*i+1; k++){
        //         System.out.print("*");
        //  }
        //     System.out.println();
        //  }
         // Pattern3
        // ************
        //   *******
        //    *****
        //     ***
        //      *

        for(int i=5; i>=0;i--){
            for(int j =0;j < 5-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
         }
            System.out.println();
         }
 
    }
    
}
