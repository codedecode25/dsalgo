package codedecode;

public class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        //   d.sort(new int[]{5, 2, 5, 7, 8, 1, 12, 14, 23, 43});
       // d.productSubArray(new int[]{-4, -1, 0, 3, 10});
       d.prodSub(new int[]{-4, -1, 0, 3, 10});
    }

    void sort(int[] a) {
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
    }

    void productSubArray(int[] a) {
        for (int i = 0; i <=a.length - 1; i++) {
            a[i] = a[i] * a[i];
        }

        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
        printArray(a);

    }


    void prodSub(int[] a) {
        int[] res = new int[a.length];
        int lo = 0;
        int high = a.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (Math.abs(a[lo]) >= Math.abs(a[high])) {
                res[i] = a[lo] * a[lo];
                lo++;
            } else {
                res[i] = a[high] * a[high];
                high--;
            }
        }
        printArray(res);
    }

    void printArray(int a[]) {
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }
}
