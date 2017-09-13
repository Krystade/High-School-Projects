
public class OneToTenRandom{
public static void main(String[] args){
    for (int i = 1;i < 11 ;i++){
        int numberSquared = i * i;
        int r = (int) (Math.random() * (numberSquared - i)) + i;
        System.out.println(i + "\t" + numberSquared + "\t" + r);
    }
}
}