package main.model;

import static java.lang.Math.max;
import static java.lang.Math.min;

// appeal is a meter between 0-100
// relationship is a meter between 0-100
public class survivor {
    private final String NAME;

    private int appeal;
    private int relationship;

    public survivor(String name) {
        this.NAME = name;
        this.appeal = 0;
        this.relationship = 0;
    }

    public survivor(String name, int appeal, int relationship) {
        this.NAME = name;
        this.appeal = appeal;
        this.relationship = relationship;
    }

    // EFFECTS: changes appeal by the given int
    public void alterAppealBy(int appeal) {
        setAppeal(getAppeal() + appeal);
    }

    // EFFECTS: changes relationship by the given int
    public void alterRelationshipBy(int relationship) {
        setRelationship(getRelationship() + relationship);
    }

    public String getNAME() {
        return NAME;
    }

    public int getAppeal() {
        return appeal;
    }

    // EFFECTS: changes appeal, always within 0-100
    //          if out of range, goes to closest value
    public void setAppeal(int appeal) {
        this.appeal = (appeal > 100) ? 100 : max(0, appeal);
    }

    public int getRelationship() {
        return relationship;
    }

    // EFFECTS: changes relationship, always within 0-100
    //          if out of range, goes to closest value
    public void setRelationship(int relationship) {
        this.relationship = (relationship > 100) ? 100 : max(0, relationship);
    }
}
