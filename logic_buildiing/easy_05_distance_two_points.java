import java.util.*;

public class easy_05_distance_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(getDistance(x1,y1,x2,y2));
        sc.close();
    }

    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        double res = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return res;
    }
}
