public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int Bmultiplier = 5;
        int Smultiplier = 1;

        int holdBigCount = 0;
        int holdSmallCount = 0;
        //find required bigPack
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (goal >= 5 && bigCount != 0) {
                for (int i = goal; i > 0; i--) {
                    if (i % 5 == 0 && i <= bigCount*5) {
                        holdBigCount = i;
                        break;
                    }
                }
            }
            if (goal <= 5 && smallCount >= goal) {
                holdSmallCount = goal;
            } else if (goal >= 5 && smallCount != 0 && holdBigCount !=0 && (smallCount >= (goal%5)) && (goal-holdBigCount) <= smallCount ) {
                holdSmallCount = goal - (holdBigCount);
            }
            if (holdBigCount + holdSmallCount == goal) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
    }

    }
}
