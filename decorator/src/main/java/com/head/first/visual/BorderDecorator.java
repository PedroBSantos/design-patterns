package com.head.first.visual;

public class BorderDecorator extends VisualComponentDecorator {

    private int borderWidth;

    public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
        this.visualComponent = visualComponent;
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
        this.drawBorder();
    }

    public void drawBorder() {
        for (int i = 0; i < borderWidth; i++) {
            System.out.print("-");
        }
    }
}
