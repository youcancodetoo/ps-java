public class Main {

    public static void main(String[] args) {
        DsArray dsArray = new DsArray();
        System.out.println("DsArray -> twoSumNumbers");
        printArray(dsArray.twoSumNumbers(new int[]{2,11,7,13}, 9));

        DsHashMap dsHashMap = new DsHashMap();
        System.out.println("DsHashMap -> twoSum");
        printArray(dsHashMap.twoSum(new int[]{2,11,7,13}, 9));

    }

    private static void printArray(int[] arr) {
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
