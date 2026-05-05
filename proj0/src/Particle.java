import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;
import java.util.Map;

public class Particle {
    public ParticleFlavor flavor;
    public int lifespan;

    public static final int PLANT_LIFESPAN = 150;
    public static final int FLOWER_LIFESPAN = 75;
    public static final int FIRE_LIFESPAN = 10;
    public static final Map<ParticleFlavor, Integer> LIFESPANS =
            Map.of(ParticleFlavor.FLOWER, FLOWER_LIFESPAN,
                   ParticleFlavor.PLANT, PLANT_LIFESPAN,
                   ParticleFlavor.FIRE, FIRE_LIFESPAN);

    public Particle(ParticleFlavor flavor) {
        this.flavor = flavor;
        if (flavor == ParticleFlavor.FLOWER) {
            lifespan = LIFESPANS.get(flavor);
        } else if (flavor == ParticleFlavor.PLANT) {
            lifespan = LIFESPANS.get(flavor);
        } else if (flavor == ParticleFlavor.FIRE) {
            lifespan = LIFESPANS.get(flavor);
        } else {
            lifespan = -1;
        }

    }

    public Color color() {
        if (flavor == ParticleFlavor.EMPTY) {
            return Color.BLACK;
        } else if (flavor == ParticleFlavor.SAND) {
            return Color.YELLOW;
        } else if (flavor == ParticleFlavor.BARRIER) {
            return Color.GRAY;
        } else if (flavor == ParticleFlavor.WATER) {
            return Color.BLUE;
        } else if (flavor == ParticleFlavor.FOUNTAIN) {
            return Color.CYAN;
        } else if (flavor == ParticleFlavor.PLANT) {
            double ratio = (double) Math.max(0, Math.min(lifespan, PLANT_LIFESPAN)) / PLANT_LIFESPAN;
            int g = 120 + (int) Math.round((255 - 120) * ratio);
            return new Color(0, g, 0);
        } else if (flavor == ParticleFlavor.FIRE) {
            double ratio = (double) Math.max(0, Math.min(lifespan, FIRE_LIFESPAN)) / FIRE_LIFESPAN;
            int r = (int) Math.round(255 * ratio);
            return new Color(r, 0, 0);
        }
        double ratio = (double) Math.max(0, Math.min(lifespan, FLOWER_LIFESPAN)) / FLOWER_LIFESPAN;
        int r = 120 + (int) Math.round((255 - 120) * ratio);
        int g = 70 + (int) Math.round((141 - 70) * ratio);
        int b = 80 + (int) Math.round((161 - 80) * ratio);
        return new Color(r, g, b);
    }

    public void moveInto(Particle other) {
        other.flavor = this.flavor;
        other.lifespan = this.lifespan;
        this.flavor = ParticleFlavor.EMPTY;
        this.lifespan = -1;

    }

    public void fall(Map<Direction, Particle> neighbors) {
        Particle p = neighbors.get(Direction.DOWN);
        if (p.flavor == ParticleFlavor.EMPTY){
            moveInto(p);
        }
    }

    public void flow(Map<Direction, Particle> neighbors) {
        int randint = StdRandom.uniformInt(3);
        Particle q = neighbors.get(Direction.LEFT);
        Particle r = neighbors.get(Direction.RIGHT);
        if (randint == 0){
            return;
        }
        if (randint == 1) {
            if (q.flavor == ParticleFlavor.EMPTY) {
                moveInto(q);
            }
        }
        if (randint == 2) {
            if (r.flavor == ParticleFlavor.EMPTY) {
                moveInto(r);
            }
        }
          else {
              return;
            }
        }


    public void grow(Map<Direction, Particle> neighbors) {
        int randint = StdRandom.uniformInt(10);
        Particle p = neighbors.get(Direction.UP);
        Particle q = neighbors.get(Direction.LEFT);
        Particle r = neighbors.get(Direction.RIGHT);
        if (randint == 0) {
            if (p.flavor == ParticleFlavor.EMPTY) {
                p.flavor = this.flavor;
                p.lifespan = LIFESPANS.get(this.flavor);
            }
        }
        if (randint == 1) {
            if (q.flavor == ParticleFlavor.EMPTY) {
                q.flavor = this.flavor;
                q.lifespan = LIFESPANS.get(this.flavor);
            }
        }
        if (randint == 2) {
            if (r.flavor == ParticleFlavor.EMPTY) {
                r.flavor = this.flavor;
                r.lifespan = LIFESPANS.get(this.flavor);
            }
        }
        else {
            return;
        }
    }

    public void burn(Map<Direction, Particle> neighbors) {
        int randint1 = StdRandom.uniformInt(10);
        int randint2 = StdRandom.uniformInt(10);
        int randint3 = StdRandom.uniformInt(10);
        int randint4 = StdRandom.uniformInt(10);
        Particle p = neighbors.get(Direction.UP);
        Particle q = neighbors.get(Direction.LEFT);
        Particle r = neighbors.get(Direction.RIGHT);
        Particle s = neighbors.get(Direction.DOWN);

        if (randint1 < 4) {
            if (p.flavor == ParticleFlavor.PLANT || p.flavor == ParticleFlavor.FLOWER) {
                p.flavor = ParticleFlavor.FIRE;
                p.lifespan = LIFESPANS.get(ParticleFlavor.FIRE);
            }
        }
        if (randint2 < 4) {
            if (q.flavor == ParticleFlavor.PLANT || q.flavor == ParticleFlavor.FLOWER) {
                q.flavor = ParticleFlavor.FIRE;
                q.lifespan = LIFESPANS.get(ParticleFlavor.FIRE);
            }
        }
        if (randint3 < 4) {
            if (r.flavor == ParticleFlavor.PLANT || r.flavor == ParticleFlavor.FLOWER) {
                r.flavor = ParticleFlavor.FIRE;
                r.lifespan = LIFESPANS.get(ParticleFlavor.FIRE);
            }
        }
        if (randint3 < 4) {
            if (s.flavor == ParticleFlavor.PLANT || s.flavor == ParticleFlavor.FLOWER) {
                s.flavor = ParticleFlavor.FIRE;
                s.lifespan = LIFESPANS.get(ParticleFlavor.FIRE);
            }
        }

    }


    public void action(Map<Direction, Particle> neighbors) {
        if (this.flavor == ParticleFlavor.EMPTY){
            return;
        }
        if (this.flavor != ParticleFlavor.BARRIER) {
            fall(neighbors);
        }
        if (this.flavor == ParticleFlavor.WATER) {
            flow(neighbors);
        }
        if (this.flavor == ParticleFlavor.PLANT){
            grow(neighbors);
        }
        if (this.flavor == ParticleFlavor.FLOWER) {
            grow(neighbors);
        }
        if (this.flavor == ParticleFlavor.FIRE) {
            burn(neighbors);
        }


    }
    public void decrement_Lifespan() {
        if (this.lifespan > 0) {
            this.lifespan -= 1;
        }
        if (this.lifespan == 0) {
            this.flavor = ParticleFlavor.EMPTY;
            this.lifespan = -1;
        }
    }

}
