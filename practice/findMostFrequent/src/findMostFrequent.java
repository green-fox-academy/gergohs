public class findMostFrequent {

    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'B', 'C', 'D', 'D', 'D', 'D', 'D', 'E', 'E', 'E', 'F', 'F', 'G'};
        char mostFrequentLetter;
        mostFrequentLetter = findElement(letters);

        System.out.println("The most frequent letter is: " + mostFrequentLetter);
    }

    private static char findElement(char[] array) {
        int charCounter = 0;
        int highestCounter = 0;
        char mostFrequent = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                charCounter++;
            } else {
                charCounter = 0;
            }
            if (charCounter > highestCounter) {
                highestCounter = charCounter;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }
}
