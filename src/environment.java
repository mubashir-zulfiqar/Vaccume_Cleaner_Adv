import java.util.Random;

public class environment implements EnvironmentInterface{
    Room[][] room;
    int score = 100;
    public int agentCurrFloor = new Random().nextInt(2);
    public int agentCurrRoom = new Random().nextInt(3);

    environment() {
        room = new Room[3][4];
        // Ground Floor
        room[0][0] = new Room(true, true);
        room[0][1] = new Room(false, true);
        room[0][2] = new Room(true, false);
        room[0][3] = new Room(false, true);

        // 1nd Floor
        room[1][0] = new Room(false, true);
        room[1][1] = new Room(false, false);
        room[1][2] = new Room(false, true);
        room[1][3] = new Room(false, true);

        // 2rd Floor
        room[2][0] = new Room(false, false);
        room[2][1] = new Room(false, true);
        room[2][2] = new Room(false, true);
        room[2][3] = new Room(false, true);
    }

    @Override
    public void moveLeft() {
        if (agentCurrRoom == 0) {
            System.out.println("There are no rooms on the Left.\n");
        } else if (!room[agentCurrFloor][agentCurrRoom].canEnter) {
            System.out.println("Agent cannot go into Room " + agentCurrRoom + " on Floor " + agentCurrFloor + ".\n");
        } else {
            agentCurrRoom -= 1;
            System.out.println("Agent is now moved to Left room. Floor: " + (agentCurrFloor + 1) + ", Room: " + (agentCurrRoom + 1));
            score -= 10;
            System.out.println("10 points are deducted. Score: " + score + "\n");
        }
    }

    @Override
    public void moveRight() {
        if (agentCurrRoom == 3) {
            System.out.println("There are no rooms on the Right.\n");
        } else if (!room[agentCurrFloor][agentCurrRoom].canEnter) {
            System.out.println("Agent cannot go into Room " + agentCurrRoom + " on Floor " + agentCurrFloor + ".\n");
        } else {
            agentCurrRoom += 1;
            System.out.println("Agent is now moved to Right room. Floor: " + (agentCurrFloor + 1) + ", Room: " + (agentCurrRoom + 1));
            score -= 10;
            System.out.println("10 points are deducted. Score: " + score + "\n");
        }
    }

    @Override
    public void moveUp() {
        if (agentCurrFloor == 2) {
            System.out.println("you are already on the top floor.\n");
        } else {
            agentCurrFloor += 1;
            System.out.println("you are now in the " + (agentCurrFloor == 2 ? "top" : "upper") + " floor. Floor: " + (agentCurrFloor + 1) + ", Room: " + (agentCurrRoom + 1));
            score -= 10;
            System.out.println("10 points are deducted. Score: " + score + "\n");
        }
    }

    @Override
    public void moveDown() {
        if (agentCurrFloor == 0) {
            System.out.println("you are already on the Ground floor.\n");
        } else {
            agentCurrFloor -= 1;
            System.out.println("you are now in the " + (agentCurrFloor == 0 ? "Ground" : "lower") + " floor. Floor: " + (agentCurrFloor + 1) + ", Room: " + (agentCurrRoom + 1));
            score -= 10;
            System.out.println("10 points are deducted. Score: " + score + "\n");
        }
    }

    @Override
    public void suck() {
        if (!room[agentCurrFloor][agentCurrRoom].dirty) {
            System.out.println("Room " + (agentCurrRoom + 1) + " on Floor " + (agentCurrFloor + 1) + " is already cleaned.\n");
        } else {
            room[agentCurrFloor][agentCurrRoom].dirty = false;
            System.out.println("Room " + (agentCurrRoom + 1) + " on Floor " + (agentCurrFloor + 1) + " is now cleaned.\n");
            score += 100;
            System.out.println("100 points are added. Score: " + score + "\n");
        }
    }

    @Override
    public boolean isDirty() {
        return room[agentCurrFloor][agentCurrRoom].dirty;
    }

    @Override
    public int getScore() {
        return score;
    }
}