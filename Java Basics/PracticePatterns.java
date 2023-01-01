public class PracticePatterns {
    public static void main(String[] args) {
        int row=5;
        int col =5;
        // Pattern 1  Solid Rectangle
//**********
//**********
//**********
//**********

//        for(int i=1; i<=row;i++){
//            for(int j=1;j<=col;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern2 Hollow Rectangle
//        *****
//        *   *
//        *   *
//        *   *
//        *****
//        for(int i=1;i<=row;i++){
//            for(int j =1; j<=col;j++){
//                if(i==1 || j==1 || i==row ||j==col){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Pattern 3  Half Pyramid
//        *
//        **
//        ***
//        ****
//        *****
//        for(int i=1; i<=row;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
// Pattern 4  Inverted Half Pyramid
//        ****
//        ***
//        **
//        *
//        for(int i=row; i>=1;i--){
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern5 Inverted half Pyramid rotate by 180 degrees
//         *
//        **
//       ***
//      ****
//     *****
//        for(int i=1;i<=row;i++){
//            // for spaces
//            for(int j=1;j<=row-i;j++){
//                System.out.print(" ");
//            }
//            // for stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern6 Half Pyramid with numbers
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Pattern 7 Inverted Half Pyramid with numbers
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
