package Shorna.java;

public class TaxData {
        private double corporateTax;
        private double payrollTax;
        private double vat;
        private String taxDeadline;

        public TaxData(double corporateTax, double payrollTax, double vat, String taxDeadline) {
            this.corporateTax = corporateTax;
            this.payrollTax = payrollTax;
            this.vat = vat;
            this.taxDeadline = taxDeadline;
        }

        public double getCorporateTax() {
            return corporateTax;
        }

        public void setCorporateTax(double corporateTax) {
            this.corporateTax = corporateTax;
        }

        public double getPayrollTax() {
            return payrollTax;
        }

        public void setPayrollTax(double payrollTax) {
            this.payrollTax = payrollTax;
        }

        public double getVat() {
            return vat;
        }

        public void setVat(double vat) {
            this.vat = vat;
        }

        public String getTaxDeadline() {
            return taxDeadline;
        }

        public void setTaxDeadline(String taxDeadline) {
            this.taxDeadline = taxDeadline;
        }

        @Override
        public String toString() {
            return "Corporate Tax: $" + corporateTax + "\n" +
                    "Payroll Tax: $" + payrollTax + "\n" +
                    "VAT: $" + vat + "\n" +
                    "Deadline: " + taxDeadline;
        }
    }


