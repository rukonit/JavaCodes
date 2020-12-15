public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number >= 0){
            String Fnum = String.valueOf(number).substring(0, 1);
            String Lnum = String.valueOf(number).substring(String.valueOf(number).length() - 1, String.valueOf(number).length());

            //System.out.println(Lnum);
            return Integer.parseInt(Fnum) + Integer.parseInt(Lnum);
        }
        else {return -1;}
    }
}
