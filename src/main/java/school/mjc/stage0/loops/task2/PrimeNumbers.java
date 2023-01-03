package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            if (num < 4) {
                System.out.println(num);
                num += 1;
                continue;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                num += 1;
                continue;
            }

            int count = 2;
            boolean prime = true;
            while (count * count <= num) {
                if (num % count == 0) {
                    prime = false;
                    break;
                }
                count += 1;
            }
            if (!prime) {
                num += 1;
                continue;
            }

            System.out.println(num);
            num += 1;
        }
    }
}
