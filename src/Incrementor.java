public class Incrementor {

   private int increment;

    public int getIncrement() {
        return this.increment;
    }

    private void setIncrement(int increment) {
        this.increment = increment;
    }

    public synchronized void increment() {
        this.setIncrement(this.getIncrement() + 1);
    }

}
