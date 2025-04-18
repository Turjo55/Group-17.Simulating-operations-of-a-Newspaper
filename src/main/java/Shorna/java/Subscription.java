package Shorna.java;

    public class Subscription {
        private String userId;
        private String type;
        private String status;
        private String startDate;
        private String endDate;

        public Subscription(String userId, String type, String status, String startDate, String endDate) {
            this.userId = userId;
            this.type = type;
            this.status = status;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public String getUserId() {
            return userId;
        }

        public String getType() {
            return type;
        }

        public String getStatus() {
            return status;
        }

        public String getStartDate() {
            return startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        @Override
        public String toString() {
            return String.format("User: %s | Type: %s | Status: %s | From: %s To: %s",
                    userId, type, status, startDate, endDate);
        }


    }


