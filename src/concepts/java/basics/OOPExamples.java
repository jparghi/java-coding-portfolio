abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double w,h;
    Rectangle(double w,double h){this.w=w;this.h=h;}
    double area(){return w*h;}
}

class Circle extends Shape {
    double r; Circle(double r){this.r=r;}
    double area(){return Math.PI*r*r;}
}

interface Printable { void print(); }

class Invoice implements Printable {
    String id; double amount;
    Invoice(String id, double amount){ this.id=id; this.amount=amount; }
    public void print(){ System.out.println("Invoice "+id+" amount "+amount); }
}

public class OOPExamples {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3,4);
        Shape s2 = new Circle(2);
        System.out.println("Rect area="+s1.area()+", Circle area="+s2.area());
        Printable p = new Invoice("INV-1001", 199.99);
        p.print();
    }
}
