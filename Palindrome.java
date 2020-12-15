public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        String holder = String.valueOf(number).replace("-", "");
        String getter = "";

        for (int i = 0; i < holder.length(); i++){
            if (getter.length() > 0) {
                getter = holder.substring(i, i + 1) + getter;
            }
            else {
                getter = holder.substring(i, i + 1) ;
            }

        }
        int x = (Integer.parseInt(holder));
        int y = (Integer.parseInt(getter));
        int j = x - y;

        if (j == 0){
            return true;
        }
        else {return false;}

    }
}
