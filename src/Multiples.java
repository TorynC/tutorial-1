

class Multiples {

    public static void main(String[] args) {
        int positives = 0;
        int i = 1;
        while (i < 1000) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;
            if (divisibleby3 && divisibleby5) {
                positives ++;
                i++;
            } else if (divisibleby3) {

                positives ++;
                i++;

            } else if (divisibleby5) {

                positives++;
                i++;

            }else {

                i++;
            }
        }
        System.out.println(positives);
    }

}
