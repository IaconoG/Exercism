public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double baseMultiplier = 1.0;
        double penalty = 0.15;
        int maxDaysSkippedBeforePenalty = 5;
        return (daysSkipped > maxDaysSkippedBeforePenalty) ? baseMultiplier - penalty : baseMultiplier;
        // Aplica un descuento del 15% si se han perdido más de cinco días
    }

    public double multiplierPerProductsSold(int productsSold) {
        double baseMultiplier = 10.0;
        double impovedMultiplier = 13.0;
        return (productsSold > 20) ? impovedMultiplier : baseMultiplier;
        // Utiliza un multiplicador de 13 si se han vendido más de 20 productos, de lo contrario, usa 10
    }

    public double bonusForProductSold(int productsSold) {
        double mutiplier = this.multiplierPerProductsSold(productsSold);
        return productsSold * mutiplier;
        // Calcula el bono multiplicando la cantidad de productos vendidos por el multiplicador correspondiente
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final double salaryLimit = 2000.0;
        double baseSalary = 1000.0;
        double salaryMultiplier = multiplierPerDaysSkipped(daysSkipped);
        double bonus = this.bonusForProductSold(productsSold);
        

        double totalSalary = (baseSalary * salaryMultiplier) + bonus;  // Calcula el salario final multiplicando el salario base por el multiplicador y suma el bono
        return (totalSalary > 2000.0) ? salaryLimit : totalSalary;
        // Limita el salario a un máximo de 2000.0
    } 
}
