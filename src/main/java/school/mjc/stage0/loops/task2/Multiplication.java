package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int limit = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive < 0) {
            limit = multiplyByAndToInclusive * -1;
        }
        int num = 0;
        while (num <= limit) {
            System.out.println(num * multiplyByAndToInclusive);
            num += 1;
        }
    }
}
