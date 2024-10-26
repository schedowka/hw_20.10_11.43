import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] rain = new double[31];
        for (int i = 0; i < 31; i++) {
            rain[i] = Math.random() * 10;
            System.out.println("количество осадков:" + rain[i]);
        }

        for (int i = 0; i < 31; i++) {
            if (rain[i] == 0) {
                System.out.println("осадков не было " + (i + 1) + "января");
            }
        }
    }
}






