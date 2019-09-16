package person.java;

/**
 * created by 2019-09-16
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int []list = new int[]{10, 200, 1, 2, 3, 1, 4};
        BubbleSort.bubbleSort(list, 7);
        for(int num : list) {
            System.out.println(num + " ");
        }
    }

    private static void bubbleSort(int []list, int n) {
        for(int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }
}
