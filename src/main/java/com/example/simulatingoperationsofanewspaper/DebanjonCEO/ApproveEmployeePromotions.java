package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class ApproveEmployeePromotions {

    private str selectEmployee;
    private str promotionCriteria;

    public str getSelectEmployee() {
        return selectEmployee;
    }

    public str getPromotionCriteria() {
        return promotionCriteria;
    }

    public void setSelectEmployee(str selectEmployee) {
        this.selectEmployee = selectEmployee;
    }

    public void setPromotionCriteria(str promotionCriteria) {
        this.promotionCriteria = promotionCriteria;
    }

    @Override
    public String toString() {
        return "ApproveEmployeePromotions{" +
                "selectEmployee=" + selectEmployee +
                ", promotionCriteria=" + promotionCriteria +
                '}';
    }

    public ApproveEmployeePromotions(str selectEmployee, str promotionCriteria) {
        this.selectEmployee = selectEmployee;
        this.promotionCriteria = promotionCriteria;





    }
}
