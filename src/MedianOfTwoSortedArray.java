import java.util.Arrays;
import java.util.Collections;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int [] array1 = {3};
        int [] array2 = {-2,-1};
        System.out.print(findMedianSortedArray(array1,array2));

    }



    public static double findMedianSortedArray(int [] array1, int [] array2) {
        int[] addedArray = new int[array1.length + array2.length];
        int i = 0;
        double total = 0.0;
        double median;
        for (i = 0; i < array1.length; i++) {
            addedArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            for (int y = i; y <= i; y++) {
                addedArray[i] = array2[j];
            }
            i++;
        }

        for (int k = 0; k < addedArray.length; k++) {
            for (int l = k + 1; l < addedArray.length; l++) {
                if (addedArray[k] > addedArray[l]) {
                    int temp = 0;
                    temp = addedArray[k];
                    addedArray[k] = addedArray[l];
                    addedArray[l] = temp;
                }
            }
        }


        if(addedArray.length % 2 != 0){
            median = addedArray[addedArray.length  / 2];
        }
        else {
            double gettingMedianValues = addedArray[addedArray.length / 2 - 1] + addedArray[addedArray.length / 2];
            median =  gettingMedianValues / 2;
        }
        return median;
    }

}
