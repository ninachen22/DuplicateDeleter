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
            System.out.println("arry i value is " + array[i] + " and frequency is " + freq);
            if (array[i] == array[i - 1]) {
                System.out.print("Yes! " + array[i] + " matches " + array[i - 1]);
                freq++;
                System.out.println(". Frequency changed to " + freq);
                if (freq == exactNumberOfDuplications) {
                    exactDupesOccurances++;
                    System.out.println("[Item to store]: " +array[i]);
                    System.out.println("[Current index value]: " +exactDupesValues[indexForExactDupesArr]);
                    exactDupesValues[indexForExactDupesArr] = super.array[i];
                    System.out.println("[New index value]: " +exactDupesValues[indexForExactDupesArr]);
                    for (int j = 0; j < exactDupesOccurances; j++) {
                        System.out.println("dupe values: " + exactDupesValues[j]);
                    }
                    indexForExactDupesArr++;
                }
            } else {
                freq = 1;
            }
        }
        System.out.println("number of dupe ocurrences is: " + exactDupesOccurances);
        System.out.println("Values in new really long original array: ");
        for (int i = 0; i < exactDupesOccurances; i++) {
            System.out.println(exactDupesValues[i]);
        }


        //iterate thru og arr and add non exactDupeVals to tempArr
        Integer[] finArr = new Integer[super.array.length - (exactDupesOccurances * exactNumberOfDuplications)];
        System.out.println("length of new arr is: " + finArr.length);
        Boolean b = false; // DOES NOT MATCH
        int insertIndex = 0;
//        int m = 0;
        for (Integer i : super.array) {
            for (int j = 0; j < exactDupesOccurances; j++) {
//                System.out.println("Array["+m+"]: "+i+" -- Dups["+j+"]: "+exactDupesValues[j]);
                b = false; //CONFIRMING THAT WE START WITH FALSE, RESETTING TO FALSE FOR NEXT J (0 5 9) VALUE LOOP
                if (i == exactDupesValues[j]) {
                    b = true; //IF MATCHES, SET TO TRUE, AND THEN BREAK
                    System.out.println("Break! bc Matches!");
                    break;
                }
//                break;
            }
            System.out.println("----------------------------------------");
            if (!b) { //IF FALSE, SAVE THE NUMBER
                //System.out.println("before " + i + " is stored into fin arr, value now: " + finArr[insertIndex]);
                finArr[insertIndex] = i;
                //System.out.println("after stored " + i + " is stored into fin arr, value now: " +
                // finArr[insertIndex]);
                System.out.println("[[Final Array currently contains]]: "+ Arrays.toString(finArr));
                for (Integer integer : finArr) {
                    //System.out.println("fin values: " + integer);
                }
                //System.out.println("finished,next");
                insertIndex++;
            }
//            m++;
        }
        return finArr;
//        return new Integer[0];
    }
}
