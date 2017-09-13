public class a{
    String temp;
    int rand;
    int next;
    String[] wordArray;
    public a (String[] Array){
        String[] wordArray  = Array;
        next = -1;
        for(int i = 0; i < wordArray.length; i++){
            rand = (int)(Math.random() * wordArray.length);
            temp = wordArray[i];
            wordArray[i] = wordArray[rand];
            wordArray[rand] = temp;
        }
    }
    
    public static void whatsIt(int n)
    {
        if (n > 10){
        whatsIt(n / 10);
        System.out.print(n % 10);
       }
    }
    public static void main(String[] args){ 
        whatsIt(347);
    }
}
