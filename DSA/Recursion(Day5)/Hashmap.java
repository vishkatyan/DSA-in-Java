import java.util.HashMap;
public class Hashmap {
    static HashMap<Character,Integer> getCount(String str, int index, int length){   // it'll return hashmap
        // base case
        if(index==length){
            HashMap<Character,Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character,Integer> map= getCount(str,index+1,length);
        char singleChar = str.charAt(index);
        if(map.get(singleChar)==null){
            map.put(singleChar,1);
        }
        else{
            int count =map.get(singleChar);
            map.put(singleChar,count+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String str="ram sharma";
        System.out.println(getCount(str,0,str.length()));
    }
}
