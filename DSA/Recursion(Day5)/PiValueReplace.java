import java.lang.String;
public class PiValueReplace {
    static String replacePiValue(String str, int index){
        if(index==str.length()){
            return " ";
        }
        if(str.charAt(index)=='p' && str.charAt(index+1) =='i'){
            return "3.14" + replacePiValue(str,index+2);
        }
        else{
            return str.charAt(index) + replacePiValue(str,index+1);
        }
    }
    public static void main(String[] args) {
        String str = ("2*pi+3*pi=5*pi");
        System.out.println(replacePiValue(str,0));

    }
}
