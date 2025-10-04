package algorithms;

import metrics.SortMetrics;

public class InstrumentedSelectionSort {
    private final SortMetrics metrics;

    public InstrumentedSelectionSort() {
        this.metrics = new SortMetrics();
    }

    public void sortWithMetrics(int[] array) {
        metrics.startTimer();
        metrics.stopTimer();
    }

    public SortMetrics getMetrics() {
        return metrics;
    }
}