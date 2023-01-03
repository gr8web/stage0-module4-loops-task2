package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorialNum = 0;
        while (factorialNum <= printToInclusive) {
            if (factorialNum < 2) {
                System.out.println(1);
                factorialNum += 1;
                continue;
            }
            int count = factorialNum;
            int result = 1;
            while (count >= 1) {
                result *= count;
                count -= 1;
            }
            System.out.println(result);
            factorialNum += 1;
        }
    }
}
