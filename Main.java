import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Set possible = new Set();
        Set impossible = new Set();

        Integer[][] board = {

            { 6, 3, 1, 1, 2, 2, 3, 1 },
            { 6, 4, 6, 3, 4, 2, 4, 1 },
            { 3, 2, 4, 2, 4, 5, 2, 3 },
            { 2, 4, 4, 4, 2, 1, 2, 3 },
            { 1, 2, 3, 4, 2, 2, 2, 5 },
            { 5, 5, 4, 4, 5, 1, 5, 5 },
            { 3, 3, 4, 4, 3, 4, 2, 2 },
            { 1, 2, 3, 6, 2, 4, 1, 2 }
        };

        Combination combination = new Combination(board);  

        List<Direction> directions = new ArrayList<>(List.of(Direction.values()));
        
        Collections.shuffle(directions);
        
        directions.subList(0, 6).forEach(System.out::println);;

        
        
    }

    public void uniqueSet(Set set) {

        List<Direction> directions = new ArrayList<>(List.of(Direction.values()));
        
        Collections.shuffle(directions);
        
        var shuffled = directions.subList(0, set.getCombination().size());

        for(int i = 0; i < set.getCombination().size(); i ++) {
            set.getCombination().get(i).setDirection(shuffled.get(i));

            System.out.println("Dice " + set.getCombination().get(i).getNum() + ": " + set.getCombination().get(i).getDirection());
        }

    }

}