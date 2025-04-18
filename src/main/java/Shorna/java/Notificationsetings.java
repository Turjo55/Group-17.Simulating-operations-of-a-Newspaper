package Shorna.java;

public class Notificationsetings {
    private boolean revenueAlert;
        private boolean expenseAlert;
        private boolean bankAlert;
        private String preferredMethod;

        public boolean isRevenueAlert() {
            return revenueAlert;
        }

        public void setRevenueAlert(boolean revenueAlert) {
            this.revenueAlert = revenueAlert;
        }

        public boolean isExpenseAlert() {
            return expenseAlert;
        }

        public void setExpenseAlert(boolean expenseAlert) {
            this.expenseAlert = expenseAlert;
        }

        public boolean isBankAlert() {
            return bankAlert;
        }

        public void setBankAlert(boolean bankAlert) {
            this.bankAlert = bankAlert;
        }

        public String getPreferredMethod() {
            return preferredMethod;
        }

        public void setPreferredMethod(String preferredMethod) {
            this.preferredMethod = preferredMethod;
        }

        @Override
        public String toString() {
            return "NotificationSettings{" +
                    "revenueAlert=" + revenueAlert +
                    ", expenseAlert=" + expenseAlert +
                    ", bankAlert=" + bankAlert +
                    ", preferredMethod='" + preferredMethod + '\'' +
                    '}';
        }
    }


