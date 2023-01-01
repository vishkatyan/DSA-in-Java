import java.util.ArrayList;
public class DiceCount {
    static ArrayList<String> diceCount(int source, int target) {
        if (source == target) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        if (source > target) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        ArrayList<String> combination = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            int current = source + dice;
            ArrayList<String> empty = diceCount(current, target);
            for(String str:empty){
                combination.add(str+dice);
            }
        }
        return combination;
    }
    public static void main(String[] args) {
        ArrayList<String> a = diceCount(0,10);
        System.out.println(a);
    }
}
