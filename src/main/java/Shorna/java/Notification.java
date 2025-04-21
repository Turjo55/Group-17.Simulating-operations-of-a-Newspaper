package Shorna.java;

public class Notification {

        private String type;
        private String message;
        private String timestamp;

        public Notification(String type, String message, String timestamp) {
            this.type = type;
            this.message = message;
            this.timestamp = timestamp;
        }

        public String getType() {
            return type;
        }

        public String getMessage() {
            return message;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "[" + timestamp + "] (" + type + "): " + message;
        }
    }

