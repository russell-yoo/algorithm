import java.util.*;

class Solution {

    static class Worker implements Comparable<Worker> {

        long time;
        long takeTime;
        int cnt = 1;

        Worker(long time) {
            this.time = time;
            this.takeTime = time;
        }

        @Override
        public int compareTo(Worker o) {
            return Long.compare(this.takeTime, o.takeTime);
        }
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<Worker> queue = new PriorityQueue<>();
        for (int time : workerTimes) {
            queue.offer(new Worker(time));
        }

        long result = 0L;
        while (mountainHeight > 0) {
            Worker worker = queue.poll();
            result = Math.max(result, worker.takeTime);
            worker.cnt++;
            worker.takeTime += worker.time * worker.cnt;
            queue.offer(worker);
            mountainHeight--;
        }

        return result;
    }
}
