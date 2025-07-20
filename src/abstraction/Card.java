package abstraction;

public interface Card {
    boolean pay (int amount);
    void checkLimit();
    boolean getStatus(int score);
}
