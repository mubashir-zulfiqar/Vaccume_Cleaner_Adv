@SuppressWarnings({"ConstantConditions", "CommentedOutCode"})
public class environment implements EnvironmentInterface{
    Room[][] room;
    int score;

    environment() {
        room = new Room[2][3];
        // 1st Floor
        room[0][0] = new Room(true);
        room[0][1] = new Room(false);
        room[0][2] = new Room(false);
        room[0][3] = new Room(false);

        // 2nd Floor
        room[1][0] = new Room(false);
        room[1][1] = new Room(false);
        room[1][2] = new Room(false);
        room[1][3] = new Room(false);
    }

    @Override
    public void moveLeft() {
        
        /*if(room[0].agentPosition) {
            System.out.println("Agent is already in left room.");
            return 1;
        }
        else if(!room[0].agentPosition) {
            room[1].agentPosition = false;
            room[0].agentPosition = true;
            System.out.println("Agent is now moved to Left room.");
            score -= 10;
        }
        return 0;*/
    }

    @Override
    public void moveRight() {
        /*if(room[1].agentPosition) {
            System.out.println("Agent is already in Right room.");
            return 1;
        }
        else if(!room[1].agentPosition) {
            room[0].agentPosition = false;
            room[1].agentPosition = true;
            System.out.println("Agent is now moved to Right room.");
            score -= 10;
        }
        return 0;*/
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void suck() {
        /*int currentRoom = 0;
        if (room[0].agentPosition) currentRoom = 0; // Left
        else if (room[1].agentPosition) currentRoom = 1; // Right
        if (room[currentRoom].dirty) {
            System.out.println("Room[" + currentRoom + "] " +
                    (currentRoom == 0 ? "(Left)" : "(Right)") +
                    " is now clean.");
            room[currentRoom].dirty = false;
            score += 100;
        } else System.out.println("Room[" + currentRoom + "] " +
                (currentRoom == 0 ? "(Left)" : "(Right)") +
                " is already clean.");*/
    }

    @Override
    public boolean isDirty() {
       /* int currentRoom = 0;
        if (room[0].agentPosition) currentRoom = 0; // Left
        else if (room[1].agentPosition) currentRoom = 1; // Right
        *//*System.out.println("Room[%s] " +
                (currentRoom == 0 ? "(Left)" : "(Right)") +
                "is now clean.");*//*
        return room[currentRoom].dirty;*/
        return true;
    }

    @Override
    public int getScore() {
        return score;
    }
}