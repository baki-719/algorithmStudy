package programmers._old;

import java.util.ArrayList;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12906
 * @title : 같은 숫자는 싫어
 * @level : 1
 * @desc  : 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 *          이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 *          단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 *          예를 들면,
 *          arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 *          arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 *          배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 * @constraints :
 * - 배열 arr의 크기 : 1,000,000 이하의 자연수
 * - 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 * */
public class NoSameNum {

    public int[] solution(int []arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) result.add(arr[i]);
            else {
                if(result.get(result.size()-1) != arr[i])
                    result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int []arr) {
        return sliceAndMerge(getFrontArr(arr), getBacktArr(arr));
    }

    public int[] sliceAndMerge(int[] frontArr, int[] backArr) {
        int[] tempFrontArr;
        int[] tempBackArr;
        if(frontArr.length > 1)
            tempFrontArr = sliceAndMerge(getFrontArr(frontArr), getBacktArr(frontArr));
        else tempFrontArr = frontArr;
        if(backArr.length > 1)
            tempBackArr = sliceAndMerge(getFrontArr(backArr), getBacktArr(backArr));
        else tempBackArr = backArr;

        boolean isSame = tempFrontArr[tempFrontArr.length-1] == tempBackArr[0];
        int[] result = new int[isSame ? tempFrontArr.length + tempBackArr.length -1 : tempFrontArr.length + tempBackArr.length];
        int resultIndex = 0;

        for(int i = 0 ; i < tempFrontArr.length; i++) {
            result[resultIndex] = tempFrontArr[i];
            resultIndex++;
        }

        for(int i = isSame ? 1 : 0 ; i < tempBackArr.length; i++) {
            result[resultIndex] = tempBackArr[i];
            resultIndex++;
        }

        return result;


    }

    public int[] getFrontArr(int[] arr) {
        int[] result = new int[arr.length%2 == 1 ? arr.length/2+1 : arr.length/2];

        for(int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public int[] getBacktArr(int[] arr) {
        int[] result = new int[arr.length/2];
        int resultIndex = 0;

        for(int i = arr.length%2 == 1 ? arr.length/2+1 : arr.length/2; i < arr.length; i++) {
            result[resultIndex] = arr[i];
            resultIndex++;
        }

        return result;
    }
}
