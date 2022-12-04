import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
        this.iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ForIterator(min, max);
    }

    private class ForIterator implements Iterator<Integer> {
        protected int index;
        protected int max;

        public ForIterator(int index, int max) {
            this.index = index;
            this.max = max;
        }

        @Override
        public boolean hasNext() {
            return index <= max + 1;
        }

        @Override
        public Integer next() {
            return random.nextInt(index, (max + 1));
        }
    }
}
