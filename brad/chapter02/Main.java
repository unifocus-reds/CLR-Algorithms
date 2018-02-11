import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Solution to problem 1
        int[] test_array_01 = make_random_int_array(100);
        int[] test_array_02 = make_random_int_array(100);
        int[] test_array_03 = make_random_int_array(100);
        int[] test_array_04 = make_random_int_array(100);

        //Solution to problem 2
        System.out.println("Pre-sort randomized array:\t" + Arrays.toString(test_array_01));
        InsertionSort(test_array_01);
        System.out.println("Post-InsertionSort array:\t" + Arrays.toString(test_array_01));

        //Solution to problem 3
        System.out.println("\nPre-sort randomized array:\t" + Arrays.toString(test_array_02));
        test_array_02 = MergeSort(test_array_02);
        System.out.println("Post-MergeSort array:\t\t" + Arrays.toString(test_array_02));

        //Solutions to problem 4 (2-1, a-d)
        //2-1a) Sorting any array with InsertionSort has a Θ(n^2) worst case, so if list of k length that is Θ(k^2).
        //      If we are to n/k number of k length lists that means Θ((n/k)*k^2) = Θ(nk).
        //2-1b) Merging has a worst case of Θ(n*lg(n)) for a list of length n, so if we have sublists of n/k length, but
        //      the same number of items in all of lists when summed together, the worst case is Θ(n*lg(n/k)).  The
        //      front term is the number of items sorted (n) the number of splits we are doing is lg(n/k).  Fig 2.5d.
        //2-1c) Since Θ(nk + n*lg(n/k)) is worst time, either nk or n*lg(n/k) is dominate so either nk = n*lg(n) or
        //      n*lg(n/k) = n*lg(n), so k = lg(n) or k = 1 [lg(n/k) = lg(n) - lg(k), n*lg(n/k)=n*lg(n) -> k=1].  k=1 is
        //      trivial, so k=lg(n).  When k=1, the merge sort side is going to take as long as mergesort normally does.
        //2-1d) We should want a k < lg(n).
        System.out.println("\nPre-sort randomized array:\t" + Arrays.toString(test_array_03));
        test_array_03 = HybridSort(test_array_03, Math.log(test_array_03.length)/Math.log(2));
        System.out.println("Post-HybridSort array:\t\t" + Arrays.toString(test_array_03));

        //Solutions to problem 5 (2-2, a-d)
        //2-2a) Each A`[i] is an element of A.
        //2-2b) Invariant:      Sub-array A[1...j-1] consists of elements originally in A[1...j-1] unsorted.
        //      Initialization: Sort array starts off with no items in it.
        //      Maintenance:    Each loop iteration moves small items down.
        //      Termination:    Loop ends when gone through a.length items, twice, with A[i] as the smallest item.
        //2-2c) Array A starts off unsorted.  Each loop iteration moves smaller items to end of the array.  When loops
        //      are complete, A is sorted.
        //2-2d) Θ(n^2), just as bad as InsertionSort.  Bubblesort will be slower since it swaps as much as possible.
        System.out.println("\nPre-sort randomized array:\t" + Arrays.toString(test_array_04));
        BubbleSort(test_array_04);
        System.out.println("Post-InsertionSort array:\t" + Arrays.toString(test_array_04));
    }

    static int[] make_random_int_array(int size){
        int[] result = new int[size];
        Random rand = new Random();

        for(int i = 0; i <size; i++){
            result[i] = rand.nextInt();
        }
        return result;
    }

    static void array_swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void InsertionSort(int[] target){
        int i = 0, j;

        while (i < target.length){
            j = i;
            while (j > 0 && target[j-1] > target[j]){
                array_swap(target, j, j-1);
                j--;
            }
            i++;
        }
    }

    static int[] MergeSort(int[] target){
        if (target.length <= 1){
            return target;
        }

        int middle = target.length/2;
        int j=0, k=0;
        int[] left = new int[middle];
        int[] right = new int[target.length - middle];

        for(int i=0; i < target.length; i++){
            if (i < middle){
                left[j++] = target[i];
            } else {
                right[k++] = target[i];
            }
        }

        left = MergeSort(left);
        right = MergeSort(right);
        return Merge(left, right);
    }

    static int[] HybridSort(int[] target, double threshold){
        if (target.length < threshold){
            InsertionSort(target);
            return target;
        }

        int middle = target.length/2;
        int j=0, k=0;
        int[] left = new int[middle];
        int[] right = new int[target.length - middle];

        for(int i=0; i < target.length; i++){
            if (i < middle){
                left[j++] = target[i];
            } else {
                right[k++] = target[i];
            }
        }

        left = HybridSort(left, threshold);
        right = HybridSort(right, threshold);
        return Merge(left, right);
    }

    static int[] Merge(int[] left, int[] right){
        int j = 0, k = 0, m = 0;
        int[] result = new int[left.length + right.length];

        while (j < left.length && k < right.length){
            if (left[j] <= right[k]){
                result[m++] = left[j++];
            } else {
                result[m++] = right[k++];
            }
        }

        while (j < left.length){
            result[m++] = left[j++];
        }

        while (k < right.length){
            result[m++] = right[k++];
        }
        return result;
    }

    static void BubbleSort(int[] target){
        for(int i =0; i < target.length; i++){
            for(int j=1; j < target.length; j++){
                if (target[j] < target[j-1]){
                    array_swap(target, j, j-1);
                }
            }
        }
    }
}
