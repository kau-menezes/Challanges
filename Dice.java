import java.util.ArrayList;

public class Dice {
    protected Integer num;
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    protected Direction direction;
    
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    protected Integer x;
    protected Integer y;

    public Dice(Integer num, Integer x, Integer y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    public ArrayList<Integer> move() {

        Integer SIDE = 6;

        switch (direction) {
            case L:
                this.x = this.x - (1 * this.num);
                this.y = this.y - (0 * this.num);
                
                if (this.x > SIDE || this.x < 0) {
                    return null;
                }
                break;
    
            case DUL:
                this.x = this.x - (1 * this.num);
                this.y = this.y - (1 * this.num);
    
                if (this.x > SIDE || this.y > SIDE || this.y < 0 || this.x < 0) {
                    return null;
                }
                break;
            
            case U:
                this.x = this.x - (0 * this.num);
                this.y = this.y - (1 * this.num);
    
                if (this.y > SIDE || this.y < 0) {
                    return null;
                }
                break;
    
            case DUR:
                this.x = this.x + (1 * this.num);
                this.y = this.y - (1 * this.num);
    
                if (this.x > SIDE || this.y > SIDE || this.y < 0 || this.x < 0) {
                    return null;
                }
                break;
    
            case R:
                this.x = this.x + (1 * this.num);
                this.y = this.y - (0 * this.num);
    
                if (this.x > SIDE) {
                    return null;
                }
                break;
    
            case DLR:
                this.x = this.x + (1 * this.num);
                this.y = this.y + (1 * this.num);
    
                if (this.x > SIDE || this.y > SIDE) {
                    return null;
                }
                break;
    
            case D:
                this.x = this.x + (0 * this.num);
                this.y = this.y + (1 * this.num);
    
                if (this.y > SIDE) {
                    return null;
                }
                break;
    
            case DLL:
                this.x = this.x - (1 * this.num);
                this.y = this.y + (1 * this.num);
    
                if (this.x < 0 || this.y > SIDE) {
                    return null;
                }
                break;
    
            default:
                break;
        }

        ArrayList<Integer> result =  new ArrayList<>();
        result.add(x);
        result.add(y);

        return new ArrayList<>();
    }
}
