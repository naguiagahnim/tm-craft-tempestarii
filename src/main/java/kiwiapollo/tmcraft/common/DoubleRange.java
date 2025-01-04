package kiwiapollo.tmcraft.common;

public class DoubleRange implements Range<Double> {
    private final double minInclusive;
    private final double maxExclusive;

    public DoubleRange(double minInclusive, double maxExclusive) {
        if (minInclusive >= maxExclusive) {
            throw new IllegalArgumentException();
        }

        this.minInclusive = minInclusive;
        this.maxExclusive = maxExclusive;
    }

    @Override
    public boolean contains(Double value) {
        return minInclusive <= value && value < maxExclusive;
    }
}
