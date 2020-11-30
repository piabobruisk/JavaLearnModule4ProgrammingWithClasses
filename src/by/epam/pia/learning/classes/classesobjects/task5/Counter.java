package by.epam.pia.learning.classes.classesobjects.task5;

public class Counter {

    int count;
    int minRangeLimit;
    int maxRangeLimit;

    public Counter(int count, int minRangeLimit, int maxRangeLimit) {

        if (minRangeLimit > maxRangeLimit) {
            this.minRangeLimit = maxRangeLimit;
            this.maxRangeLimit = minRangeLimit;
        } else {
            this.minRangeLimit = minRangeLimit;
            this.maxRangeLimit = maxRangeLimit;
        }

        this.count = count;
        if (count > maxRangeLimit) this.count = maxRangeLimit;
        if (count < minRangeLimit) this.count = minRangeLimit;
    }

    public Counter(int minRangeLimit, int maxRangeLimit) {

        this(minRangeLimit, minRangeLimit, maxRangeLimit);
    }

    public Counter(int count) {

        this(count, 0, Math.max(count, 9));
    }

    public Counter() {

        this(0, 0, 9);
    }

    public int getCount() {
        return count;
    }

    public void increment() {

        if (++count > maxRangeLimit) count = 0;
    }

    public void decrement() {
        if (--count < 0) count = maxRangeLimit;
    }
}
