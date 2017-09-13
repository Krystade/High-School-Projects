
public class Baseball{
    public static void main(String[] args){
        double[] baseballAverages = new double[9];
        for (int i = 0; i < 9; i++){
            baseballAverages[i] = (Math.random()*.5);
            System.out.printf("%.3f\n", baseballAverages[i]);
        }
        double max = baseballAverages[0];
        for (int i = 1; i < 9; i++){
            if( max < baseballAverages[i]){
                max = baseballAverages[i];
            }
        }
        System.out.printf("max = %.3f",max);
    }
}
