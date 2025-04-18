package Shorna;

    public class Employee {

        private final String empId;
        private final String name;
        private final double basic;
        private final double deductions;
        private final double bonuses;

        public Employee(String empId, String name, double basic, double deductions, double bonuses) {
            this.empId = empId;
            this.name = name;
            this.basic = basic;
            this.deductions = deductions;
            this.bonuses = bonuses;
        }

        public String getEmpId() {
            return empId;
        }

        public String getName() {
            return name;
        }

        public double getBasic() {
            return basic;
        }

        public double getDeductions() {
            return deductions;
        }

        public double getBonuses() {
            return bonuses;
        }
    }


