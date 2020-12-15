public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int result = 0;
        if (first < 10 | second < 10) {
        result=  -1;
        }
        else {
            if (first > second){
            for (int i = second; i > 0; i--){
                if (second % i ==0 && first % i ==0){
                    result = i;

                    break;
                }
            }
            }
            else {
                for (int i = first; i > 0; i--){
                    if (first % i ==0 && second % i ==0){
                        result = i;

                        break;
                    }
                }
            }
        }
        return result;
        }

    }

