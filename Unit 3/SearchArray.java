
public class SearchArray{
    public static void main(String[] args){
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 51);
        }
        for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }
        int searchFor = (int)(Math.random() * 51);
        int index = -1;
    for (int i = 0; i < array.length; i++){
        if (array[i] == searchFor){
            index = i;
            break;
        }else {
            index = -1;
        }
    }
    if (index < 0 ){
        System.out.println(searchFor + " was not found in the array");
    }else{
        System.out.println(searchFor + " was found in array[" + index + "]");
    }
    }
}
