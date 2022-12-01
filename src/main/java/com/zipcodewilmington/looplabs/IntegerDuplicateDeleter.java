package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int exactDupesOccurances = 0; // num times int occurs exactNumOfDuplications times
        Integer[] exactDupesValues = new Integer[super.array.length];
        int indexForExactDupesArr = 0;
        int freq = 1;
        for (int i = 1; i < super.array.length; i++) {
//            int freq = 1;
            System.out.println("arry i value is " + array[i] + " and frequency is " + freq);
            if (array[i] == array[i - 1]) {
                System.out.println("Yes! " + array[i] + " matches " + array[i - 1]);
                freq++;
                System.out.println("Frequency changed to " + freq);
                if (freq == exactNumberOfDuplications) {
                    exactDupesOccurances++;
                    //exactDupesValues[indexForExactDupesArr] = super.array[i];
                    //indexForExactDupesArr++;
                }
            } else {
                freq = 1;
            }
        }
        System.out.println("number of dupe ocurrences is: " + exactDupesOccurances);





        for (int i = 0; i < exactDupesOccurances; i++) {
            //System.out.println("values of dupe occurances: " + exactDupesValues[i]);
        }
        //iterate thru og arr and add non exactDupeVals to tempArr
        Integer[] tempArr = new Integer[super.array.length - (exactDupesOccurances * exactNumberOfDuplications)];
        //System.out.println("length of new arr is: " + tempArr.length);
        int insertIndex = 0;
//        Integer[] finNoDupes = new Integer[super.array.length - exactNumberOfDuplications];
        for (int i = 0; i < super.array.length; i++) {
            for (int j = 0; j < exactDupesOccurances; j++) {
                if (super.array[i] != exactDupesValues[j]) {
                    tempArr[insertIndex] = super.array[i];
                    insertIndex++;
                }
            }
        }
        return tempArr;
//        return new Integer[0];
    }
}
