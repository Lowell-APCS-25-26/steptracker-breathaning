package org.APCSLowell;

public class StepTracker {
    private int min;
    private int steps = 0;
    private int activeDays = 0;
    private int days = 0;
    public StepTracker(int activityThreshold) {
        this.min = activityThreshold;
    }
    void addDailySteps(int stepCount) {
        steps += stepCount;
        days ++;
        if (stepCount >= min) activeDays++;
    }
    int activeDays() {
        return activeDays;
    }
    double averageSteps() {
        if (days == 0) return 0;
        return (double)steps / (double)days;
    }
}
