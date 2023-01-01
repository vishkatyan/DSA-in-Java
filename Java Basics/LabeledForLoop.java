public class LabeledForLoop {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            outer:  //label
            for(int j=1;j<5;j++){
                inner:   //label
                System.out.println(i + "  "+ j);
                if(i==3 && j==3){
                    break outer;   // break any outer loop by labelling
                }
            }
        }
    }
}
