class TimeSpan {
    private int hours;
    private int minutes;
    public TimeSpan(int hours, int minutes) {
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
        // Normalize minutes
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }
    public void add(TimeSpan tp) {
        add(tp.hours, tp.minutes);
    }
    public double getTotalHours() {
        return hours + minutes / 60.0;
    }
    public String toString() {
        return hours + " Hours, " + minutes + " Minutes";
    }
}