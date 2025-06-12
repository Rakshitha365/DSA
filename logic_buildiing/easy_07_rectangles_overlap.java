public class easy_07_rectangles_overlap {
    static class Point
    {
        int x, y;
        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    static boolean doOverlap(Point l1, Point r1, Point l2, Point r2)
    {
        if(l2.x > r1.x || l2.y < r2.y) return false;
        if(l1.x > r2.x || l1.y < r2.y) return false;
        return true;
    }

    public static void main(String[] args) {
        Point l1 = new Point(0,10);
        Point r1 = new Point(10,0);
        Point l2 = new Point(-10,5);
        Point r2 = new Point(-1,0);
        if(doOverlap(l1, r1, l2, r2)) System.out.println("Rectangles Overlap");
        else System.out.println("Ractangles do not Overlap");
    }
}
