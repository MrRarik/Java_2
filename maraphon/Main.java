/**
 * level 2, lesson 1
 * @author Maluy Yaroslav
 * @version data 28.07.19
 */

package maraphon;

import maraphon.competitors.*;
import maraphon.obstacles.*;

public class Main {
    public static void main(String[] args) {
         Team team = new Team("Чемпионы", new Cat("Pushok"),new Dog("Barbos"),new Human("Vasya"));
        Course c = new Course(new Cross(100), new Wall(2), new Water(50));
        c.letsGo(team);
        team.showResults();
    }
}


