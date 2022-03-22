import java.util.Objects;

public class Komplex {
     double real;
     double img;

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Komplex komplex = (Komplex) o;
          return Double.compare(komplex.real, real) == 0 && Double.compare(komplex.img, img) == 0;
     }

     @Override
     public int hashCode() {
          return Objects.hash(real, img);
     }

     @Override
     public String toString() {
          return  real + img + "i";
     }

     public Komplex(double real, double img) {
          this.real = real;
          this.img = img;
     }

     public Komplex add(Komplex b){
          return new Komplex(real + b.real,img + b.img);
     }

     public Komplex multiply(Komplex b){
          return new Komplex(real * b.real - img * b.img, img * b.real + real * b.img  );
     }

     public Komplex arg(){
          return new double[Math.atan(img / real)];
     }
}

