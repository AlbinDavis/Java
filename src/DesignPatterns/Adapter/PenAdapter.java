package DesignPatterns.Adapter;

public class PenAdapter implements Pen{
    @Override
    public void write(String text) {
        new PiolotPen().display(text);
    }
}
