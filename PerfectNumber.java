public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int total = 0;
        if (number < 1 ){
            total = -1;

        }
        else {
            for (int i = number/2; i > 0; i--){
                if (number % i ==0){
                    total =+ i + total;
                }
            }


        }
        if (total == number){
            return true;
        }
        else {
            return false;
        }
    }
}
