package app;

class Timer {
    private double mTime;

    public Timer() {
        mTime = 0.;
    }

    public double increment(double incr) {
        String incrementing = "Incrementing in Timer class....";
        mTime += incr;
        System.out.println(incrementing);
        return mTime;
    }

    public double currentTime() {
        return mTime;
    }
}