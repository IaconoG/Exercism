
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int ultimoIdxDelArray = this.birdsPerDay.length - 1;
        return this.birdsPerDay[ultimoIdxDelArray];
    }

    public void incrementTodaysCount() {
        int ultimoIdxDelArray = this.birdsPerDay.length - 1;
        this.birdsPerDay[ultimoIdxDelArray] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for (int cantBirds: this.birdsPerDay) {
            if (cantBirds == 0) {
                hasDayWithoutBirds = true;
                break;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int nroIteraciones = (this.birdsPerDay.length > numberOfDays) ? numberOfDays : this.birdsPerDay.length;
        for (int i = 0; i < nroIteraciones; i++) {
            count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int numberOfBeasyDays = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                numberOfBeasyDays++;
            }
        }
        return numberOfBeasyDays;
    }
}
