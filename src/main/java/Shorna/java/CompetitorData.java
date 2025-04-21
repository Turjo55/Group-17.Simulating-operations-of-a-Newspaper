package Shorna.java;

public class CompetitorData {

        private String name;
        private String socialMediaActivity;
        private String adCampaign;
        private String engagementStats;

        public CompetitorData(String name, String socialMediaActivity, String adCampaign, String engagementStats) {
            this.name = name;
            this.socialMediaActivity = socialMediaActivity;
            this.adCampaign = adCampaign;
            this.engagementStats = engagementStats;
        }

        public String getName() {
            return name;
        }

        public String getSocialMediaActivity() {
            return socialMediaActivity;
        }

        public String getAdCampaign() {
            return adCampaign;
        }

        public String getEngagementStats() {
            return engagementStats;
        }

        @Override
        public String toString() {
            return name + ": " + socialMediaActivity + ", " + adCampaign + ", " + engagementStats;
        }

    }

