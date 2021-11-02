public class test {
    public static void main(String[] args) throws InterruptedException {
        environment obj = new environment();
        System.out.println("On Start: Floor: " +
                (obj.agentCurrFloor + 1) +", Room: " +
                (obj.agentCurrRoom + 1) + ", Score: " + obj.getScore() + "\n");

        System.out.println("Moving up...");
        Thread.sleep(1000);
        obj.moveUp();

        System.out.println("Moving Right...");
        Thread.sleep(1000);
        obj.moveRight();

        System.out.println("Cleaning...");
        Thread.sleep(1000);
        obj.suck();

        System.out.println("Moving Down...");
        Thread.sleep(1000);
        obj.moveDown();

        System.out.println("Moving Left...");
        Thread.sleep(1000);
        obj.moveLeft();

        System.out.println("Cleaning...");
        Thread.sleep(1000);
        obj.suck();

        System.out.println("On End: Floor: " +
                (obj.agentCurrFloor + 1) +", Room: " +
                (obj.agentCurrRoom + 1) + ", Score: " + obj.getScore() + "\n");
    }
}