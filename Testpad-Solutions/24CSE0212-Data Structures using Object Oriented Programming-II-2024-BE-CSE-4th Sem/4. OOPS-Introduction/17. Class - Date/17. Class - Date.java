class Date {
    private int month;
    private int day;
    public Date(int m, int d) {
        this.month = m;
        this.day = d;
    }
    public int daysInMonth() {
        if (month == 2) return 28;
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public void nextDay() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
            }
        }
    }
    public String toString() {
        return month + "/" + day;
    }
    public int absoluteDay() {
        int total = day;
        for (int m = 1; m < month; m++) {
            if (m == 2) total += 28;
            else if (m == 4 || m == 6 || m == 9 || m == 11) total += 30;
            else total += 31;
        }
        return total;
    }
}