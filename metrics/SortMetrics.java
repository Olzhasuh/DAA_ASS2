package metrics;

public class SortMetrics {
    private long comparisons;
    private long swaps;
    private long startTime;
    private long endTime;

    public void incrementComparisons() { comparisons++; }
    public void incrementSwaps() { swaps++; }
    public void startTimer() { startTime = System.nanoTime(); }
    public void stopTimer() { endTime = System.nanoTime(); }

    public long getElapsedTime() { return endTime - startTime; }
    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
}