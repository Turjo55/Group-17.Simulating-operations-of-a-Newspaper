package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class AssignTasksToManagers {

    private str staffMember;
    private str description;
    private str deadline;
    private str  priority;

    public str getStaffMember() {
        return staffMember;
    }

    public str getDescription() {
        return description;
    }

    public str getDeadline() {
        return deadline;
    }

    public str getPriority() {
        return priority;
    }

    public void setStaffMember(str staffMember) {
        this.staffMember = staffMember;
    }

    public void setDescription(str description) {
        this.description = description;
    }

    public void setDeadline(str deadline) {
        this.deadline = deadline;
    }

    public void setPriority(str priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "AssignTasksToManagers{" +
                "staffMember=" + staffMember +
                ", description=" + description +
                ", deadline=" + deadline +
                ", priority=" + priority +
                '}';
    }

    public AssignTasksToManagers(str staffMember, str description, str deadline, str priority) {
        this.staffMember = staffMember;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;


    }
}
