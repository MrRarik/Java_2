package maraphon.obstacles;

import maraphon.competitors.Competitor;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public String doIt(Competitor competitor) {
       return competitor.swim(length);
    }
}
