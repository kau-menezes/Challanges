import java.util.ArrayList;
import java.util.stream.IntStream;

public class Combination {
    
    protected Dice[][] board;

    public Dice[][] getBoard() {
        return board;
    }

    public Combination(Integer[][] board) {
        this.board = IntStream.range(0, board.length)
                .mapToObj(x -> IntStream.range(0, board[x].length)
                        .mapToObj(y -> new Dice(board[x][y], x, y))
                        .toArray(Dice[]::new))
                .toArray(Dice[][]::new);
    }

    public boolean combine(Set set) {
        
        ArrayList<Integer> currentPosition = new ArrayList<>();
        currentPosition.add(6); // y
        currentPosition.add(0); // x

        Boolean possibility = true;

        while (true) {

            var returnMove = board[currentPosition.get(0)][currentPosition.get(1)].move();

            if (returnMove == null) {
                possibility =  false;
                break;
                
            }

            currentPosition.set(0, returnMove.get(0));
            currentPosition.set(1, returnMove.get(1));
        }

        

        return possibility;
    }

}
