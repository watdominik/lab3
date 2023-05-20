public class Main {
    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] array = {6, 1, 9, 3, 2, 7};

        System.out.println("Przed sortowaniem: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        main.insertionSort(array);

        System.out.println("\nPo sortowaniu: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
