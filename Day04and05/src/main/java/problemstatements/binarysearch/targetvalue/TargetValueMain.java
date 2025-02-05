package problemstatements.binarysearch.targetvalue;

public class TargetValueMain {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3}, {4,5,6},{7,8,9}};
        boolean result = TargetValue.findTargetElement(arr,0);
        System.out.println("is the value found : " + result);
    }
}
