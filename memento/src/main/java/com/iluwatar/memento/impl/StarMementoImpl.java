package com.iluwatar.memento.impl;

import com.iluwatar.memento.frame.StarMemento;

/**
 * @author ivaneye
 * @since 2021-01-26 18:05:55
 */
public class StarMementoImpl implements StarMemento {

    private StarType type;
    private int ageYears;
    private int massTons;

    public StarType getType() {
        return type;
    }

    public void setType(StarType type) {
        this.type = type;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    public int getMassTons() {
        return massTons;
    }

    public void setMassTons(int massTons) {
        this.massTons = massTons;
    }
}
