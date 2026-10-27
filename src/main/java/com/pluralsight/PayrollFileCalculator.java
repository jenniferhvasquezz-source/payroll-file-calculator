package com.pluralsight;

public class PayrollFileCalculator {
    public static void main(String[] args) {
    }

    private static class employee {
        private int employeeId;
        private String name;
        private double hoursWorked;
        private double payRate;

        // Parameterized constructor[span_1](start_span)[span_1](end_span)
        employee(int employeeId, String name, double hoursWorked, double payRate) {
            this.employeeId = employeeId;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.payRate = payRate;
        }
        // Getters and Setters[span_2](start_span)[span_2](end_span)
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }
        // Method to calculate and return gross pay[span_3](start_span)[span_3](end_span)
        public double getGrossPay() {
            return hoursWorked * payRate;
        }

        }
}
}