package concerto;

import java.util.HashMap;
import java.util.Map;

public class ConvertNumberIntoWords {

    private static final Map<Integer, String> LOOKUP = new HashMap<>() {{
        put(0, "Zero");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");

        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
        put(20, "Twenty");

        put(30, "Thirty");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
    }};

    private static final String SEPARATOR = " ";
    private static final String AND = "And";
    private static final String HUNDRED = "Hundred";
    private static final String THOUSAND = "Thousand";
    private static final String LAKHS = "Lakhs";
    private static final String CRORE = "Crore";

    public static String convert(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Input > 0");
        } else if (getNumberOfDigits(input) <= 2) {
            return getStringForLessThanEqualTo2Digits(input);
        } else {
            final int divisor = getDivisorBasedOnDigits(input);
            int q = input / divisor;
            int r = input % divisor;

            StringBuilder builder = new StringBuilder();
            builder.append(LOOKUP.get(q)).append(SEPARATOR).append(getString(divisor)).append(SEPARATOR).append(r != 0 ? convert(r) : SEPARATOR);
            return builder.toString();
        }

    }

    private static String getString(int divisor) {
        final int numberOfDigits = getNumberOfDigits(divisor);
        if (numberOfDigits == 3) {
            return HUNDRED;
        } else if (numberOfDigits <= 5) {
            return THOUSAND;
        } else if (numberOfDigits <= 7) {
            return LAKHS;
        } else {
            return CRORE;
        }
    }

    private static String getStringForLessThanEqualTo2Digits(int input) {
        if (LOOKUP.containsKey(input)) {
            return LOOKUP.get(input);
        }

        final int unitsPlace = input % 10;
        final int tensPlace = input - unitsPlace;
        return LOOKUP.get(tensPlace) + SEPARATOR + LOOKUP.get(unitsPlace);
    }

    private static int getDivisorBasedOnDigits(int input) {
        int multipleOfTens = 1;
        for (int i = 1; i < getNumberOfDigits(input); i++) {
            multipleOfTens = multipleOfTens * 10;
        }

        return multipleOfTens;
    }

    private static int getNumberOfDigits(int input) {
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }

        return count;
    }
}
