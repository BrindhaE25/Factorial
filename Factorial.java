public class Factorial {
    public int getFactorial(int number) {
        int result=1;
        if(number == 0)
            return 1;
        else if(number <0)
            return 0;
        else {
            for (int iter = 2; iter <= number; iter++) {
                result *= iter;
            }
            return result;
        }
    }
}
