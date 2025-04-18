package Shorna.java;

public class Invoice {
        private String vendor;
        private String invoiceNo;
        private double amount;
        private String status;

        public Invoice(String vendor, String invoiceNo, double amount, String status) {
            this.vendor = vendor;
            this.invoiceNo = invoiceNo;
            this.amount = amount;
            this.status = status;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public void setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }


