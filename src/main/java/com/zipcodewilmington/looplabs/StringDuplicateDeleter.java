package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] dupArr = new String[array.length];
        int dupArrIndex = 0;
        int freqOfNum = 1;
        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1]) {
                freqOfNum++;
                if (i != array.length - 1) continue;
            }
            if (freqOfNum >= maxNumberOfDuplications) {
                for (int j = 0; j < freqOfNum; j++) {
                    dupArr[dupArrIndex] = array[i - 1];
                    dupArrIndex++;
                }
            }
            freqOfNum = 1;
        }
        String[] finArr = new String[array.length - dupArrIndex];
        int finArrIndex = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != dupArr[j]) {
                finArr[finArrIndex] = array[i];
                finArrIndex++;
            } else {
                j++;
            }
        }
        if (maxNumberOfDuplications < 2) {
            finArr = new String[0];
        }
        return finArr;
//        return new String[0];
        // comment
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] dupArr = new String[array.length];
        int dupArrIndex = 0;
        int freqOfNum = 1;
        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1]) {
                freqOfNum++;
                if (i != array.length - 1) continue;
            }
            if (freqOfNum == exactNumberOfDuplications) {
                for (int j = 0; j < freqOfNum; j++) {
                    dupArr[dupArrIndex] = array[i - 1];
                    dupArrIndex++;
                }
            }
            freqOfNum = 1;
        }
        String[] finArr = new String[array.length - dupArrIndex];
        int finArrIndex = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != dupArr[j]) {
                finArr[finArrIndex] = array[i];
                finArrIndex++;
            } else {
                j++;
            }
        }
//        if (exactNumberOfDuplications < 1) {
//            finArr = new String[0];
//        }
        return finArr;
//        return new String[0];
    }
}
