@SuppressWarnings("CommentedOutCode")
public interface EnvironmentInterface {
    public void moveLeft();
    public void moveRight();
    public void moveUp();
    public void moveDown();
    public void suck();          // clean current cell
    public boolean isDirty();    // is current cell dirty?
    public int getScore();       // returns penalty score
}