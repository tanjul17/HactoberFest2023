import java.util.*;

public class chainOfPair {

    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // sort
        Arrays.sort(pair, Comparator.comparing(o -> o[1]));

        // work
        int chainLen = 1;
        int ChainEnd = pair[0][1];

        for (int i = 0; i < pair.length; i++) {
            if (pair[i][0] > ChainEnd) {
                chainLen++;
                ChainEnd = pair[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
