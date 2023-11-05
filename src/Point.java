public class Point {
    int x;
    int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printXY() {
        System.out.print("(" + x + ":" + y + ")");
    }
}
