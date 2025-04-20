package com.example.simulatingoperationsofanewspaper.DebanjonProductionManager;

public class ApproveProductionSchedules {

    private String scheduleId;
    private String productionDate;
    private String shift;
    private String task;
    private String status;

    public ApproveProductionSchedules(String scheduleId, String productionDate, String shift, String task, String status) {
        this.scheduleId = scheduleId;
        this.productionDate = productionDate;
        this.shift = shift;
        this.task = task;
        this.status = status;
    }
}
