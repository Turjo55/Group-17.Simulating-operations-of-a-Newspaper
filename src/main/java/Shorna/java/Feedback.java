package Shorna.java;

public class Feedback {

        private String username;
        private String comment;
        private String timestamp;

        public Feedback(String username, String comment, String timestamp) {
            this.username = username;
            this.comment = comment;
            this.timestamp = timestamp;
        }

        public String getUsername() {
            return username;
        }

        public String getComment() {
            return comment;
        }

        public String getTimestamp() {
            return timestamp;
        }

        @Override
        public String toString() {
            return username + " [" + timestamp + "]: " + comment;
        }
    }

