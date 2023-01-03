import java.sql.Array;
import java.util.ArrayList;

public class DiagonalMazePath {
    static ArrayList<String> mazePath(int currentRow, int currentCol, int row, int col){
        // base case
        if(currentCol==row && currentRow==col){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // negative base case
        if(currentRow>row || currentCol>col){
            ArrayList<String> list = new ArrayList<>();
            return  list;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = mazePath(currentRow,currentCol+1,row,col);
        for(String s: horizontal){
            result.add("H"+s);
        }
        ArrayList<String> vertical = mazePath(currentRow+1,currentCol,row,col);
        for(String s: vertical){
            result.add("V"+s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> res = mazePath(1,1,3,3);
        System.out.println(res);
    }
}
