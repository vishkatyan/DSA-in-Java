import java.lang.String;
public class AddStarBtwnAdjacentChar {
    static String output="";
    static void add(String str, int index){
        output = output+str.charAt(index);
        if(index==str.length()-1){
            return;
        }
        if(str.charAt(index) == str.charAt(index+1)){
           output +="*";
        }
             add(str,index+1);

    }
    public static void main(String[] args) {
        String str = ("abbabaab");
        add(str,0);
        System.out.println(output);
    }
}
