
public class StandardDeviation{
    public static void main(String[] args){
        int[] scores = new int[10];
        double[] newScores = new double[scores.length];
        int total = 0;
        double newTotal = 0;
        for (int i = 0; i < scores.length; i++){
            scores[i] = (int)(Math.random() * 101);
            System.out.println(scores[i]);
        }
        for (int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        double mean = (double)total/scores.length;
        System.out.println("Total: " + total);
        System.out.println("Mean: " + mean);
        for (int i = 0; i < scores.length; i++){
            newScores[i] = Math.pow(scores[i] - mean, 2);
            System.out.println(newScores[i]);
        }
        for (int i = 0; i < scores.length; i++){
            newTotal += newScores[i];
        }
        double newMean = (double)newTotal/newScores.length;
        double standardDeviation = Math.sqrt(newMean);
        System.out.println("Total: " + newTotal);
        System.out.println("Mean: " + newMean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
