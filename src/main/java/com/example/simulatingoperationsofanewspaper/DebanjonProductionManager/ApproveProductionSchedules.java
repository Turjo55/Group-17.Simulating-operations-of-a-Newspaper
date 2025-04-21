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

    private Str name;

    public String getScheduleId() {
        return scheduleId;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getShift() {
        return shift;
    }

    public String getTask() {
        return task;
    }

    public String getStatus() {
        return status;
    }

    public Str getName() {
        return name;
    }

    public ApproveProductionSchedules(Str name) {
        this.name = name;




    }
}
