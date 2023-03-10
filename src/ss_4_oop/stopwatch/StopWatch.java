package ss_4_oop.stopwatch;

import java.time.ZonedDateTime;


public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    long start() {
        startTime = ZonedDateTime.now().toInstant().toEpochMilli();
        return startTime;
    }

    long stop() {
        endTime = ZonedDateTime.now().toInstant().toEpochMilli();
        return endTime;
    }

    String getter() {
        return "Start time:" + this.startTime + " and stop time:" + this.endTime;
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}