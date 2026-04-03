package com.example.lab4_unit3.entity;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task{
    //BillableTask have an additional hourlyRate attribute.
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

