public class MultiArray {
    public static void main(String[] args) {
        int [][]array1={{1,2,3},{4,5,6}};
        int [][]array2={{1,2,},{3},{4,5,6}};
        System.out.println("The values of array1 are:");
        outputArray(array1);
        System.out.println("The values of array2 are:");
        outputArray(array2);

    }

    public static void outputArray(int[][]array) {
        for(int row=0; row< array.length;row++){
            for(int column=0;column<array[row].length;column++){
                System.out.printf("%d",array[row][column]);
            }
                System.out.println();
        }

    }


}

