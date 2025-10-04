Selection Sort Implementation
Project Overview
This is a Java implementation of the Selection Sort algorithm for Algorithm Analysis assignment. The project includes multiple versions of the algorithm with performance tracking capabilities.
What's Included
Core Sorting Classes
SelectionSort.java - Basic selection sort implementation
InstrumentedSelectionSort.java - Enhanced version that tracks performance metrics
Performance Tracking
SortMetrics.java - Measures execution time, comparisons, and swaps
Tracks:
Execution time in nanoseconds
Number of comparisons made
Number of element swaps performed
Testing & Benchmarking
SelectionSortTest.java - Unit tests for basic functionality
InstrumentedSelectionSortTest.java - Tests for metrics collection
BenchmarkRunner.java - Command-line tool to test performance
Key Features
Basic Selection Sort algorithm
Performance metrics collection
Early termination optimization
Comprehensive unit testing
Command-line benchmarking tool
Memory-efficient implementation
Algorithm Complexity
Time Complexity: O(n²) for all cases
Space Complexity: O(1) - sorts in place
Optimization: Early termination when array is sorted
How to Use
Basic Sorting:
java
int[] array = {5, 2, 8, 1, 9};
SelectionSort.sort(array);
With Metrics:
java
InstrumentedSelectionSort sorter = new InstrumentedSelectionSort();
sorter.sortWithMetrics(array);
SortMetrics metrics = sorter.getMetrics();
Run Benchmarks:
java
// Run from command line
java cli.BenchmarkRunner
Testing
The project includes tests for:
Empty arrays
Single element arrays
Already sorted arrays
Reverse sorted arrays
Arrays with duplicates
Metrics collection accuracy
Assignment Context
Pair: 1
Role: Student B (Selection Sort)
Partner's Algorithm: Insertion Sort
Task: Implement, analyze, and cross-review algorithms

This implementation focuses on clean code, proper testing, and performance analysis required for the algorithmic analysis assignment.
