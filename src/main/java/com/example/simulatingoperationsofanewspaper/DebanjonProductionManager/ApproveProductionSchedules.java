package com.example.simulatingoperationsofanewspaper.DebanjonProductionManager;

public class ApproveProductionSchedules {

    private String scheduleId;
    private String productionDate;
    private String shift;
    private String task;
    private String status;

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApproveProductionSchedules(String scheduleId, String productionDate, String shift, String task, String status) {
        this.scheduleId = scheduleId;
        this.productionDate = productionDate;
        this.shift = shift;
        this.task = task;
        this.status = status;


    }
}
