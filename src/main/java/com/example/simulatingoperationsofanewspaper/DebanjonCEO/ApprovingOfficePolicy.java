package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class ApprovingOfficePolicy {

    private String policyId;
    private String description;
    private String status;

    public String getPolicyId() {
        return policyId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ApprovingOfficePolicy{" +
                "policyId='" + policyId + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public ApprovingOfficePolicy(String policyId, String description, String status) {
        this.policyId = policyId;
        this.description = description;
        this.status = status;


    }
}
