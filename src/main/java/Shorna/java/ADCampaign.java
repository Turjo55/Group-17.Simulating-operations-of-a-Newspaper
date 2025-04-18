package Shorna.java;

public class ADCampaign {
    private String slotName;
    private String campaignName;
    private String schedule;
    private double cost;

    public ADCampaign(String slotName, String campaignName, String schedule, double cost) {
        this.slotName = slotName;
        this.campaignName = campaignName;
        this.schedule = schedule;
        this.cost = cost;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return campaignName + " (" + slotName + ") - $" + cost;
    }

}
