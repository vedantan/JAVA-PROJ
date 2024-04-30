package com.vedant;

public class Propel2 {
    public static void main(String[] args) {
        String inputStr = "99946";
        String challengeToken = "f4rmu89a1";
        String result = processString(inputStr, challengeToken);
        System.out.println(result);
    }
    public static String processString(String inputStr, String challengeToken) {
        StringBuilder processedStr = new StringBuilder();

        // Step 1: Insert dashes between each two odd numbers and asterisks between each two even numbers
        for (int i = 0; i < inputStr.length() - 1; i++) {
            processedStr.append(inputStr.charAt(i));
            if (isOdd(Character.getNumericValue(inputStr.charAt(i))) && isOdd(Character.getNumericValue(inputStr.charAt(i + 1)))) {
                processedStr.append("-");
            } else if (isEven(Character.getNumericValue(inputStr.charAt(i))) && isEven(Character.getNumericValue(inputStr.charAt(i + 1)))) {
                processedStr.append("*");
            }
        }
        processedStr.append(inputStr.charAt(inputStr.length() - 1));

        // Step 2: Remove characters from the ChallengeToken
        for (char c : challengeToken.toCharArray()) {
            processedStr = new StringBuilder(processedStr.toString().replace(Character.toString(c).toLowerCase(), ""));
            processedStr = new StringBuilder(processedStr.toString().replace(Character.toString(c).toUpperCase(), ""));
        }

        // Step 3: Check if the final string is empty
        if (processedStr.length() == 0) {
            return "EMPTY";
        } else {
            return processedStr.toString();
        }
    }

    private static boolean isOdd(int n) {
        return n != 0 && n % 2 != 0;
    }

    private static boolean isEven(int n) {
        return n != 0 && n % 2 == 0;
    }
}
