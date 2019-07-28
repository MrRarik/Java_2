package maraphon.competitors;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (type + " " + name + " справился с кроссом");
        } else {
            onDistance = false;
            return (type + " " + name + " провалил кроссом");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeight) {
            return (type + " " + name + " справился с прыжком");
        } else {
            onDistance = false;
            return (type + " " + name + " провалил прыжок");

        }
    }

    @Override
    public String swim(int dist) {
        if (maxSwimDistance == 0) {
            onDistance = false;
            return (type + " " + name + " плавать не умеет");

        } else if (dist <= maxSwimDistance) {
            return (type + " " + name + " проплыл удачно");
        } else {
            onDistance = false;
            return (type + " " + name + " не смог проплыть");

        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }
}


