/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i = dofizzbuzzw(i);
        }
    }

    private static int dofizzbuzzw(int i) {
        boolean dby3 = i % 3 == 0;
        boolean dby5 = i % 5 == 0;
        if (dby3 && dby5){
            System.out.println("Fizz Buzz");
        }
        else if (dby3){
            System.out.println("Fizz");
        }
        else if (dby5){
            System.out.println("Buzz");
        }
        else System.out.println(i);
        i++;
        return i;
    }

    private static void fizzbuzzf(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}


