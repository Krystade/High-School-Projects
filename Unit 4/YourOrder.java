
public class YourOrder{
    public static void main (String[] args){
        String words = "";
        String [] s1 = words.split(" ");
        String[] done = new String [s1.length];
        for(int i = 1; i < s1.length + 1; i++){
            for (int j = 0; j < s1.length; j++){
                if (s1[j].contains(i + "") == true){
                    done[i - 1] = s1[j];
                }
            }
        }
        System.out.println(words);
        for ( String item : done){
            System.out.print(item + " ");
        }
    }
}

/*public class Order {
  public static String order(String words) {
    String output = "";
    String [] s1 = words.split(" ");
    String[] done = new String [s1.length];
    if (words.length() == 0){
      return "";
    }
    for(int i = 1; i < s1.length + 1; i++){
      for (int j = 0; j < s1.length; j++){
        if (s1[j].contains(i + "") == true){
          done[i - 1] = s1[j];
         }
       }
     }
     System.out.println(words);
     for ( String item : done){
       output += item + " ";
     }
      return output;
   }
}*/
