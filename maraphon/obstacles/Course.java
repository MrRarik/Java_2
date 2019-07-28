//Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
// метод который будет просить команду пройти всю полосу;

package maraphon.obstacles;

import maraphon.competitors.*;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void letsGo(Team team) {
        Competitor[] competitor = team.getCompetitor();

        for (Competitor c : competitor) {
            for (Obstacle o : obstacles) {
                team.setResult(o.doIt(c));
                if(!c.isDistance()) {
                    break;
                }
            }
        }
    }
}
