class Circle{
   
 //properties
 public int radius;

 
//Methods 
public double area(){
     
     return Math.PI*radius*radius;
}

public double perimeter(){
       return 2*Math.PI*radius;
}


public double circumference(){

       return perimeter();
  }
}


public class Main{
       
     public static void main(String ...args){
         
         
         Circle c1=new Circle();
         c1.radius=7;

         System.out.println("Area of circle is "+c1.area());
         System.out.println("Perimter of circle is "+c1.perimeter());

     
     }
}