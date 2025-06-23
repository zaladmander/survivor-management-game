package main.model;

// appeal is a meter between 0-100
// relationship is a meter between 0-100
public class survivor {
    private final String NAME;

    private int appeal;
    private int relationship;

    public survivor(String name, int appeal, int relationship) {
        this.NAME = name;
        this.appeal = appeal;
        this.relationship = relationship;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public int getRelationship() {
        return relationship;
    }

    public void setRelationship(int relationship) {
        this.relationship = relationship;
    }
}
