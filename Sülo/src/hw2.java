import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 99) + 1;
        }
        System.out.println("The list: " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("While it is sorted: " + Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int num = list[i];
            int temp = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < num) {
                    num = list[j];
                    temp = j;
                }
            }

            if (temp != i) {
                list[temp] = list[i];
                list[i] = num;
            }

        }
    }
}