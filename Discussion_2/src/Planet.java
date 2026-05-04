import java.util.List;

public class Planet {
    double x;
    double y;
    double mass;

    Planet (double px, double py, double pmass){
        x = px;
        y = py;
        mass = pmass;
    }

    double distance_to(Planet P2){
        double x_squared = Math.pow((P2.x - this.x), 2);
        double y_squared = Math.pow((P2.y - this.y), 2);
        return Math.sqrt(x_squared + y_squared);
    }

    public static double total_mass(List<Planet> Planets){
        double total = 0;
        for (Planet P : Planets){
            total = total + P.mass;
        }
        return total;
    }
}

void main(){
    Planet P1 = new Planet(5, 10, 100);
    Planet P2 = new Planet(1, 2, 200);
    IO.println(P1.distance_to(P2));
    List<Planet> planetlist = new ArrayList<>();
    planetlist.add(P1);
    planetlist.add(P2);
    IO.println(Planet.total_mass(planetlist));
}