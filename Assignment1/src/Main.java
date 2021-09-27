import javax.management.remote.NotificationResult;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr6 = {1,2,3,2};
        int[] arr5 = {1,1,1,1,1};
        int[] arr4 = {1,2,3,4,5};
        int[] arr3 = {-4,-1,0,3,10};
        int[] arr2 = {-7,-3,2,3,11};
        int[] arr1 = {2,3,4,2,2,3,5,7};

        System.out.println(SumOfUniqueElements(arr6));
        System.out.println(SumOfUniqueElements(arr5));
        System.out.println(SumOfUniqueElements(arr4));
        for(int i : SortedSquared(arr3))
            System.out.print(i + " ");
        System.out.println();
        for(int j : SortedSquared(arr2))
            System.out.print(j + " ");
        System.out.println();
        System.out.println(FirstUniqueInt(arr1));
        System.out.println(ContainRansomNote("a","b"));
        System.out.println(ContainRansomNote("aa","ab"));
        System.out.println(ContainRansomNote("aa","aab"));
        System.out.println(FollowedByOther("1A3d4s5t"));
        System.out.println(FollowedByOther("A2bb2d4"));
    }

    // Question One
    public static int SumOfUniqueElements(int[] arr){

        if(arr == null)
            return 0;

        int sum = 0;

        for( int i = 0; i < arr.length; i++){
            boolean duplicate = false;
            for( int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                    duplicate = true;
                }
            }
            if(duplicate)
                arr[i] = 0;
        }

        for(int i : arr){
            sum += i;
        }
        return sum;
    }//End of Question One

    // Question Two
    public static int[] SortedSquared(int[] arr){

        if(arr == null)
            return null;

        int[] squaredArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            squaredArray[i] = arr[i] * arr[i];
        }

        Arrays.sort(squaredArray);

        return squaredArray;
    }// End of Question Two
    
    // Question Three
    public static int FirstUniqueInt(int[] arr){

        for(int i = 0; i < arr.length; i ++){
            boolean duplicate = false;

                for(int j = 0; j < arr.length; j ++){
                    if(arr[i] == arr[j] && i != j){
                        duplicate = true;
                        break;
                    }
                }

                if(!duplicate){
                    return arr[i];
                }
        }

        throw new IllegalArgumentException("No result founded");
    }// End of Question Three

    public static boolean ContainRansomNote(String note, String magazine){
        if(note == null || magazine == null || note.isEmpty() || magazine.isEmpty())
            return false;
        else
            return magazine.contains(note);
    }// End of Question Four

    public static boolean FollowedByOther(String str){
        if(str == null || str.isEmpty())
            return false;

        int index = 0;

        if(Character.isDigit(str.charAt(index))){
            while(index < str.length()){
                if(Character.isDigit(str.charAt(index))){
                    index += 2;
                }
                else
                    return false;
            }
        }
        else if(Character.isLetter(str.charAt(index))){
            while(index < str.length()){
                if(Character.isLetter(str.charAt(index))){
                    index += 2;
                }
                else
                    return false;
            }
        }
          return true;

    }// End of Question Five
}
