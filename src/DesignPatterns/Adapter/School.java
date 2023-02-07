package DesignPatterns.Adapter;

public class School {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pen);
        aw.writeAssignment("Not interested in these assignments");
    }
}
