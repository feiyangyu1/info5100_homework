public class Roomba implements iRobot{

    public int[][] room;
    public Direction direction = Direction.DOWN;
    public int rowLocation = 0;
    public int colLocation = 0;

    public Roomba(int[][] room){
        this.room = room;
    }
    @Override
    public boolean move() {
            if (direction == Direction.UP) {
                if (room[rowLocation - 1][colLocation] == -1)
                    return false;
                else {
                    rowLocation -= 1;
                    return true;
                }

            }
            if (direction == Direction.DOWN) {
                if (room[rowLocation + 1][colLocation] == -1)
                    return false;
                else {
                    rowLocation += 1;
                    return true;
                }
            }
            if (direction == Direction.LEFT) {
                if (room[rowLocation][colLocation - 1] == -1)
                    return false;
                else {
                    colLocation -= 1;
                    return true;
                }
            }
            if (direction == Direction.RIGHT) {
                if (room[rowLocation][colLocation + 1] == -1)
                    return false;
                else {
                    colLocation += 1;
                    return true;
                }
            }

            return false;
    }

    @Override
    public void turnLeft() {
        if(direction == Direction.DOWN){
            direction = Direction.RIGHT;}
        else if(direction == Direction.UP){
            direction = Direction.LEFT;}
        else if(direction == Direction.LEFT){
            direction = Direction.DOWN;
        }
        else{
            direction = Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if(direction == Direction.DOWN){
            direction = Direction.LEFT;}
        else if(direction == Direction.UP){
            direction = Direction.RIGHT;}
        else if(direction == Direction.LEFT){
            direction = Direction.UP;
        }
        else{
            direction = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[rowLocation][colLocation] = 1;
    }
}
