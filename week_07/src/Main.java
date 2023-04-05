import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN");
//    int[] nums = {5,1,1,2,0,0};
//    int[] res = mergeSort(nums);
//            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//            int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
//            int[] result = removeDuplicates(nums);
//
//            System.out.println(Arrays.equals(result, expectedNums));

        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "([{}])";

        isValid(str1);
        isValid(str2);
        isValid(str3);
        isValid(str4);
        isValid(str5);

//        countSymbols("Hello wOrld");
//        countSymbols("itgirls are learning java");
    }
//
//        private static int[] removeDuplicates ( int[] nums){
//            Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//            ArrayList<Integer> resList = new ArrayList<>();
//            for (Integer el : numSet) {
//                resList.add(el);
//            }
//            while (resList.size() < nums.length) {
//                resList.add(0);
//            }
//            System.out.println(resList.toString());
//            int[] res = resList.stream().mapToInt(Integer::intValue).toArray();
//            return res;
//        }
//
    public static void isValid(String s) {
        System.out.println("=========== isValid =============");
        String [] open = {"(","[","{"};
        String [] close = {")", "]", "}"};
        Stack<String> parStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            String sym = String.valueOf(s.charAt(i));
            if(parStack.size() == 0) {
                parStack.push(sym);
            } else if(parStack.size() > 0){
                String x = parStack.peek();
                int a = findIndexOf(open, x);
                int b = findIndexOf(close, sym);
                if(a > -1 && b > -1 && a == b) {
                    parStack.pop();
                } else {
                    parStack.push(sym);
                }
            }

        }
        System.out.println("Result for " + s + " is " + (parStack.size() == 0));
    }
    public static int findIndexOf(String [] arr, String value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
//
//    public static void countSymbols(String str){
//        Map<String, Integer> symMap = new HashMap<>();
//        for(int i = 0; i < str.length(); i++){
//            String sym = String.valueOf(str.charAt(i)).toLowerCase();
//            if(symMap.containsKey(sym)){
//                int count = symMap.get(sym);
//                symMap.put(sym, count+1);
//            } else {
//                symMap.put(sym, 1);
//            }
//        }
//        System.out.println(symMap.toString());
//    }

    //============Sort


    public static int[] mergeSort(int[] nums){
        if(nums.length == 2){
            if(nums[0] > nums[1]){
                int tmp = nums[0];
                nums[0] = nums[1];
                nums[1] = tmp;
            }
        }
        if(nums.length > 2){
            int mid = nums.length/2;
            int[] arr1 = getArray(nums, 0, mid-1);
            int[] arr2 = getArray(nums, mid, nums.length-1);
            mergeSort(arr1);
            mergeSort(arr2);
            int i1 = 0;
            int i2 = 0;
            for(int i = 0; i < nums.length; i++){
                if (i2 == arr2.length || arr1[i1] < arr2[i2]){
                    nums[i] = arr1[i1];
                    i1++;
                } else if(i1 == arr1.length || arr1[i1] > arr2[i2]) {
                    nums[i] = arr2[i2];
                    i2++;
                }
            }
        }
        return nums;
    };
    public static int[] getArray(int[]arr, int start, int end){
        int [] res = new int[end-start+1];
        for(int i = start; i<end+1; i++){
            res[i-start] = arr[i];
        }
        return res;
    }

}