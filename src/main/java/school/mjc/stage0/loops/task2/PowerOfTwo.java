package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int count = 0;
        int base = 2;
        while (count <= power) {
            if (count == 0) {
                System.out.println(1);
                count += 1;
                continue;
            }
            if (count == 1) {
                System.out.println(2);
                count += 1;
                continue;
            }
            base *= 2;
            System.out.println(base);
            count += 1;
        }
    }
}
