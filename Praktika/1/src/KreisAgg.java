public class KreisAgg implements Figuren {
    Point mittelpunkt;
    double radius;

    KreisAgg(){
        mittelpunkt = new Point();
    }
    KreisAgg(int x, int y, double r){
        mittelpunkt = new Point(x,y);
        this.radius = r;
    }

    public double flächenInhalt(){
        return (Math.pow(this.radius,2) * Math.PI);
    }
    KreisAgg clones(){
       return new KreisAgg(this.mittelpunkt.x, this.mittelpunkt.y, this.radius);
    }
   public  String toStrings(){ return "(" + this.mittelpunkt.x + this.mittelpunkt.y + this.radius + ")";}
    boolean equals(KreisAgg k){
        return (this.radius == k.radius && this.mittelpunkt.x == k.mittelpunkt.x && this.mittelpunkt.y == k.mittelpunkt.y);
    }
}
