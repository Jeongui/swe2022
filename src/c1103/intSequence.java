package c1103;

public interface intSequence {
    int next();
    default boolean hasNext(){return true;}
}
