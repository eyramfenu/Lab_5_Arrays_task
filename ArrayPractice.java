import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        int[] array = {2,5,8,3,4,6,10,15,20,1,11};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original Array: " + Arrays.toString(array));

        // Identify index given a value
        System.out.println("Enter a given value: ");
        int value = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println("Value " + value + " found at index " + index);
        else
            System.out.println("Value not found!");

        // Swap two values
        System.out.print("\nEnter first index to swap: ");
        int i = scanner.nextInt();
        System.out.print("Enter second index to swap: ");
        int j = scanner.nextInt();
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println("Array after swapping: " + Arrays.toString(array));

        // 3. Sort ascending & descending
        int[] asc = array.clone();
        Arrays.sort(asc);
        System.out.println("\nAscending order: " + Arrays.toString(asc));

        int[] desc = asc.clone();
        for (int k = 0; k < desc.length / 2; k++) {
            int t = desc[k];
            desc[k] = desc[desc.length - 1 - k];
            desc[desc.length - 1 - k] = t;
        }
        System.out.println("Descending order: " + Arrays.toString(desc));

        // 4. Linear search
        System.out.print("\nEnter value for linear search: ");
        int linearVal = scanner.nextInt();
        int linearIndex = -1;
        for (int k = 0; k < array.length; k++) {
            if (array[k] == linearVal) {
                linearIndex = k;
                break;
            }
        }
        if (linearIndex != -1)
            System.out.println("Linear Search: Found at index " + linearIndex);
        else
            System.out.println("Linear Search: Not found");

        // 5. Binary search (must be done on sorted array)
        System.out.print("\nEnter value for binary search: ");
        int binVal = scanner.nextInt();
        int binResult = Arrays.binarySearch(asc, binVal);
        if (binResult >= 0)
            System.out.println("Binary Search: Found at index " + binResult + " in sorted array");
        else
            System.out.println("Binary Search: Not found");

        scanner.close();
    }
}





