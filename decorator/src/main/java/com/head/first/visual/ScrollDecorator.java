package com.head.first.visual;

import java.util.logging.Logger;

public class ScrollDecorator extends VisualComponentDecorator {

    private int scrollPosition;

    public ScrollDecorator(VisualComponent visualComponent, int scrollPosition) {
        this.visualComponent = visualComponent;
        this.scrollPosition = scrollPosition;
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
        this.scrollTo();
    }

    public void scrollTo() {
        Logger.getGlobal().info("Scrolling to position: " + this.scrollPosition);
    }
}
