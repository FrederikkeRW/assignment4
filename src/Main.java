/*
 Write a function which takes a list of integers and prints out the elements on the uneven/even and all indices.
 */

public class Main {
    public static void main (String[] args){
        int[] listOfInt = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Uneven integers");
        unevenInt(listOfInt);
        System.out.println("Even integers");
        evenInt(listOfInt);
        System.out.println("All integers");
        printList(listOfInt);
    }


    static void unevenInt(int[] list){
        for (int i = 0; i < list.length; i++){
            if (list[i] % 2 != 0){
                System.out.println(list[i]);
            }
        }
    }

    static void evenInt(int[] list){
        for (int i = 0; i < list.length; i++){
            if (list[i] % 2 == 0 ){
                System.out.println(list[i]);
            }
        }
    }

    static void printList(int[] list){
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
