package maraphon.obstacles;

import maraphon.competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String doIt(Competitor competitor) {
        return competitor.jump(height);
    }
}
