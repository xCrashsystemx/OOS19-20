public class Point{
    int x, y;

    Point(){

    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point getLocation(){
        return this;
    }
    Point setLocation(Point p){
        this.x = p.x;
        this.y = p.y;
        return p;
    }

    void setLocation (int x, int y){
        this.x = x;
        this.y = y;
    }

    void move (int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    boolean equals(Point p){
        return (this.x == p.x && this.y == p.y);
    }
    String toStrings(){
        return "(" + this.x + "," + this.y + ")";
    }
}