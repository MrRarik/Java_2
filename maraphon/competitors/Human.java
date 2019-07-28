package maraphon.competitors;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    public boolean onDistance;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 3000;
        this.maxJumpHeight = 2;
        this.maxSwimDistance = 100;
        this.onDistance = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " справился с кроссом");
        } else {
            onDistance = false;
            return (name + " провалил кроссом");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeight) {
            return (name + " справился с прыжком");
        } else {
            onDistance = false;
            return (name + " провалил прыжок");

        }
    }

    @Override
    public String swim(int dist) {
        if (maxSwimDistance == 0) {
            onDistance = false;
            return (name + " плавать не умеет");
        }
        if (dist <= maxSwimDistance) {
            return (name + " проплыл удачно");
        } else {
            onDistance = false;
            return (name + " не смог проплыть");

        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }
}
