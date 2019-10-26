public class Rechteck implements Figuren {
    Point a, b, c, d;
    Rechteck(){
        a = new Point();//Obere Linke Ecke
        b = new Point();//Obere Rechte Ecke
        c = new Point();//Untere Linke Ecke
        d = new Point();//Untere Rechte Ecke
    }   //Wir spannen das Rechteck mit ingesamt 2 Punkten auf und erweitern dieses mit 4 Punkten.
    Rechteck(int x1, int y1,int x2, int y2){
        a = new Point(x1,y1);
        d = new Point(x2,y2);
        b = new Point(x2,y1);
        c = new Point(x1,y2);

    }

   public  double flächenInhalt(){
        int seitenlänge_a = this.b.x - this.a.x;
        int seitenlänge_b = this.b.y - this.d.y;
        return (seitenlänge_a * seitenlänge_b);
    }

    public String toStrings() {return " a (" + this.a.x + this.a.y + ") \n" +
                                "b (" + this.b.x + this.b.y + ") \n" +
                                "c (" + this.c.x + this.c.y + ") \n" +
                                "d (" + this.d.x + this.d.y + ") \n"; }

    Rechteck clones(){
        return new Rechteck(this.a.x,this.a.y,this.b.x,this.b.y);
    }
    boolean equals(Rechteck r){ return (this.a.x == r.a.x && this.a.y == r.a.y && this.b.x == r.b.x && this.b.y ==  r.b.y);}
}
