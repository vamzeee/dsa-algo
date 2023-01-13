class Solution {
    public int[][] merge(int[][] intervals) {
        // sorting the 2D array
        int n = intervals.length;
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        LinkedList<int[]> output = new LinkedList<>();
        for (int[] interval : intervals) {
            // check if its the first element being added or if there is no overlap
            if (!output.isEmpty() && output.getLast()[1] >= interval[0]) {
                while (!output.isEmpty() && output.getLast()[1] >= interval[0]) {
                    // if there is overlap, just compare the interval ends and update
                    interval[0] = Math.min(output.getLast()[0], interval[0]);
                    interval[1] = Math.max(output.getLast()[1], interval[1]);
                    output.removeLast();
                }
            }
            output.addLast(interval);
        }
        int[][] out = new int[output.size()][];
        int pos = 0;
        for (int[] row : output) {
            out[pos++] = row;
        }
        return out;
    }
}