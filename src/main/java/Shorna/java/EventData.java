package Shorna.java;

    public class EventData {
        private String eventName;
        private int registrations;
        private double attendancePercentage;

        public EventData(String eventName, int registrations, double attendancePercentage) {
            this.eventName = eventName;
            this.registrations = registrations;
            this.attendancePercentage = attendancePercentage;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public int getRegistrations() {
            return registrations;
        }

        public void setRegistrations(int registrations) {
            this.registrations = registrations;
        }

        public double getAttendancePercentage() {
            return attendancePercentage;
        }

        public void setAttendancePercentage(double attendancePercentage) {
            this.attendancePercentage = attendancePercentage;
        }
    }


