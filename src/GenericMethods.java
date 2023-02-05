// Generic methods- basic use
public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        System.out.println(displayFirstElement(intArray));
        displayArray(doubleArray);
        System.out.println(displayFirstElement(doubleArray));
        displayArray(charArray);
        System.out.println(displayFirstElement(charArray));
        displayArray(stringArray);
        System.out.println(displayFirstElement(stringArray));
    }

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static <Thing> Thing displayFirstElement(Thing[] array) {
        return array[0];
    }
}
