package person.java;
/**
 * created by 2019-09-15
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int []list = new int[]{10, 200, 1, 2, 3, 1, 4};
        SelectSort.selectSort(list, 7);
        for(int num : list) {
            System.out.println(num + " ");
        }
    }

    private static void selectSort(int []list, int n) {

        int pos;
        for(int i = 0; i < n; i++) {
            pos = i;
            for(int j = i + 1; j < n; j++) {
                if(list[pos] > list[j]) {
                    pos = j;
                }
            }
            if(pos != i) {
                int tmp = list[i];
                list[i] = list[pos];
                list[pos] = tmp;
            }
        }
    }
}
