import java.util.*;

class EmployeeBonusCalculator {

    // Method to generate salary and years of service for employees
    static int[][] generateEmployeeData(int numEmployees) {
		
		// [salary, yearsOfService]
        int[][] employeeData = new int[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
			
			// Let Salary and Year of Service to be "Random"
            employeeData[i][0] = 10000 + (int) (Math.random() * 90000);
            employeeData[i][1] = 1 + (int) (Math.random() * 10);
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
		
		// [newSalary, bonus]
        double[][] updatedData = new double[employeeData.length][2]; 
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    // Method to calculate and display totals
    static void displayTotals(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%10s %15s %15s %15s %15s\n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%10d %15d %15d %15.2f %15.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%10s %15.2f %15s %15.2f %15.2f\n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        final int numEmployees = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display totals
        displayTotals(employeeData, updatedData);
    }
}
