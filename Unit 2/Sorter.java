
public class Sorter {
    public static void main(String[] args){
                int[] numbers = new int[20];
                int[] numbers2 = new int[20];
                 System.out.println("Data Set - Unsorted: ");
                for(int i = 0; i < 20; i++){
                 numbers[i] = (int)(Math.random() * 30) + 5;
                 numbers2[i] = numbers[i];
                 //Print out unsorted data to the 4th decimal point
                 System.out.print(numbers[i] + " ");
                 //After 10 (exactly 1/2) of the values gets printed, fo to a new line
                 if(i == 9){
                     System.out.print("\n");
                 }
                }
                System.out.println();
                
                //Begin printing out the sorted list(low to high)
                System.out.println("Sorted from low to high: ");
                //For loop that goes through entire array
                for (int i = 0; i < numbers.length; i++){
                    int min = numbers[i];
                    int minPlace = i;
                    int minIndex = i;
                    //nested for loop that checks all numbers after the one currently on (i)
                    for (int j = i + 1; j <= numbers.length - 1; j++){
                        //Find min number
                        if (min > numbers[j]){
                            min = numbers[j];
                            minPlace = j;
                        }
                    }
                    //Sorting from lowest to highest
                    int temp = numbers[minIndex];
                    numbers[minIndex] = numbers[minPlace];
                    numbers[minPlace] = temp;
                    System.out.print( numbers[i] + " ");
                    if(i == 10){
                        System.out.print("\n");
                    }
                   }
                   //For loop that goes through entire array

                   //Begin printing out the sorted list(high to low)
                   System.out.println("\nSorted from high to low: ");
                   for (int i = 0; i < numbers2.length; i++){
                       int max = numbers2[i];
                       int maxPlace = i;
                       int maxIndex = i;
                       //nested for loop that checks all numbers after the one currently on (i)
                       for (int j = i + 1; j <= numbers2.length - 1; j++){
                           //Find max number
                           if (max < numbers2[j]){
                               max = numbers2[j];
                               maxPlace = j;
                           }
                       }
                       //Sorting from highest to lowest on the second array
                       int temp = numbers2[maxPlace];
                       numbers2[maxPlace] = numbers2[maxIndex];
                       numbers2[maxIndex] = temp;
                           System.out.print(numbers2[i] + " ");
                           if(i == 10){
                               System.out.print("\n");
                       }
                   }
    }
}
                
