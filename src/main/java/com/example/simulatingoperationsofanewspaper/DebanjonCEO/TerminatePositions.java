package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class TerminatePositions {

    private Str name;
    private Str id;
    private Str number;
    private Str sector;
    private Str performance;

    public Str getName() {
        return name;
    }

    public Str getId() {
        return id;
    }

    public Str getNumber() {
        return number;
    }

    public Str getSector() {
        return sector;
    }

    public Str getPerformance() {
        return performance;
    }

    public void setName(Str name) {
        this.name = name;
    }

    public void setId(Str id) {
        this.id = id;
    }

    public void setNumber(Str number) {
        this.number = number;
    }

    public void setSector(Str sector) {
        this.sector = sector;
    }

    public void setPerformance(Str performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "TerminatePositions{" +
                "name=" + name +
                ", id=" + id +
                ", number=" + number +
                ", sector=" + sector +
                ", performance=" + performance +
                '}';
    }

    public TerminatePositions(Str name, Str id, Str number, Str sector, Str performance) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.sector = sector;
        this.performance = performance;



    }
}
