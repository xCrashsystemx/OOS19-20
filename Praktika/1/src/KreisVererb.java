public class KreisVererb extends Point{
    double radius;

    KreisVererb(){

    }
    KreisVererb(int x,int y,int r){
        this.x=x;
        this.y=y;
        this.radius=r;
    }
    KreisVererb(KreisVererb k){
        this.x=k.x;
        this.y=k.y;
        this.radius=k.radius;
    }
    boolean equals(KreisVererb k){
        return(this.x==k.x&&this.y==k.y&&this.radius==k.radius);
    }


    String toStrings(){
        return "("+this.x+","+this.y + ","+this.radius+")";
    }


    void setRadius(int r){
        this.radius = r;
    }

    double getRadius(){
        return this.radius;
    }
}
