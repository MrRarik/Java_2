package maraphon.competitors;

public interface Competitor {
    String run(int dist);

    String jump(int height);

    String swim(int dist);

    boolean isDistance();
}
