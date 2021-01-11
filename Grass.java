import java.util.*;
class Grass {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    double t,total=0;
    double C= kbd.nextDouble();
    double L= kbd.nextDouble();
    if((0<C && C<=100) && (0<L && L<=100)){
     
        for(int i=0;i<L;i++){
           double W= kbd.nextDouble();
           double l= kbd.nextDouble();
            t=W*l;
            total=t+total;
        }
        total = total*C;
    } 
      System.out.print(total);
  }
}
