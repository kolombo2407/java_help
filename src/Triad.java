
import java.util.Objects;

public class Triad <F, S, T> {

    private Triad(final F first, final S second, final T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <F, S, T> Triad<F, S, T> of (final F first, final S second, final T third){
        return new Triad<>(first, second, third);
    }

    public F getFirst() {return first;}
    public S getSecond() {return second;}
    public T getThird() {return third;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triad<?, ?, ?> triad = (Triad<?, ?, ?>) o;
        return Objects.equals(getFirst(), triad.getFirst()) && Objects.equals(getSecond(), triad.getSecond()) && Objects.equals(getThird(), triad.getThird());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond(), getThird());
    }



    private final F first;
    private final S second;
    private final T third;

}
