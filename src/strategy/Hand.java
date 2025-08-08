package strategy;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int handValue;

    private static Hand[] hands = {ROCK, SCISSORS, PAPER};

    Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    // this가 강한 손일 때 true,
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;

            // 가위(0) 는 보(2) 를 이김, 바위(1) 는 가위(0) 를 이김, 보(2) 는 바위(1) 를 이김
            // 원형에서 +1하면 내가 지는 손이 나옴
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
