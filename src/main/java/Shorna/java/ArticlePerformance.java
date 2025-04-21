package Shorna.java;

public class ArticlePerformance {

        private String title;
        private boolean isTopPerforming;

        public ArticlePerformance(String title, boolean isTopPerforming) {
            this.title = title;
            this.isTopPerforming = isTopPerforming;
        }

        public String getTitle() {
            return title;
        }

        public boolean isTopPerforming() {
            return isTopPerforming;
        }

        @Override
        public String toString() {
            return title;
        }
    }


