class Box{
    private double w;
    private double h;
    private double d;

    Box(){
        w=h=d=0;
    }

    Box(double w, double h,double d){
        this.w=w;
        this.h=h;
        this.d=d;
    }

    Box(double a){
        w=h=d=a;
    }

    Box(Box ob){
        w= ob.w;
        h= ob.h;
        d= ob.d;
    }

    double volume(){
        return w*d*h;
    }

// Getter & Setter code.

    public double getW(){
        return w;
    }

    public void setW(double w){
        this.w = w;
    }

    public double getH(){
        return h;
    }

    public void setH(double h){
        this.h = h;
    }

    public double getD(){
        return d;
    }

    public void setD(double d){
        this.d = d;
    }

//to string 

    public String toString(){
        return ("Dimensions of Box\nWidth:"+w+"\nHeigth:"+h+"\nDeptht:"+d);
    }
}


public class BoxClass {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(5);
        Box myBox3 = new Box(5,10,15);
        Box myBox4 = new Box(myBox3);
        Box myBox5 = myBox3;

        System.out.println("\nVol. of myBox1 is "+myBox1.volume());
        System.out.println("Vol. of myBox2 is "+myBox2.volume());
        System.out.println("Vol. of myBox3 is "+myBox3.volume());
        System.out.println("Vol. of myBox4 is "+myBox4.volume());
        System.out.println("Vol. of myBox5 is "+myBox5.volume()+"\n");

        myBox1.setW(1);
        myBox1.setD(2);
        myBox1.setH(3);

        System.out.println("Vol. of myBox1 Getter & Setter is "+myBox1.volume()+"\n");

        System.out.println(myBox5);
    }
}