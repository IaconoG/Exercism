public class CarsAssemble {
  /*
    1 to 4: 100% success rate.
    5 to 8: 90% success rate.
    9: 80% success rate.
    10: 77% success rate.
  */

  public double productionRatePerHour(int speed) {
    int carProducedEachHour = 221;
    double succesRate = 1.0; // 100% by default

    double production = 0.0;

    if (speed >= 1 && speed <= 4) {
      succesRate = 1.0; // 100%
    } else if (speed >= 5 && speed <= 8) {
      succesRate = 0.9; // 90%
    } else if (speed == 9) {
      succesRate = 0.8; // 80%
    } else if (speed == 10) {
      succesRate = 0.77; // 77%
    }

    return speed * carProducedEachHour * succesRate;
  }

  public int workingItemsPerMinute(int speed) {
    int carProducedEachHour = 221;
    double carProducedEachMinute = (double) carProducedEachHour / 60;
      // (double) -> cast a double

    double succesRate = 1.0; // 100% by default


    if (speed >= 1 && speed <= 4) {
      succesRate = 1.0; // 100%
    } else if (speed >= 5 && speed <= 8) {
      succesRate = 0.9; // 90%
    } else if (speed == 9) {
      succesRate = 0.8; // 80%
    } else if (speed == 10) {
      succesRate = 0.77; // 77%
    }
    double production = speed * carProducedEachMinute * succesRate;

    return (int) production; // cast production a un `int`, esto nos permite convertir un double a int.
  }
}
