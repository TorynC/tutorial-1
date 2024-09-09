public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int number = 100;
        while (number > 0) {
            if (number % 2 == 0) {
                number = number / 2;
                steps++;
            } else {
                number = number - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
