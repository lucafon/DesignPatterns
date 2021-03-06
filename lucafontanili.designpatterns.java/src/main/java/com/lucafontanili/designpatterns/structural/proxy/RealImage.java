package com.lucafontanili.designpatterns.structural.proxy;

class RealImage implements ImageInterface {

    private final String fileName;

    RealImage(String fileName) {
	this.fileName = fileName;
	load(this.fileName);
    }

    private void load(String fileName) {
	logger.info(new StringBuilder(32).append("Loading image from disk ").append(fileName));

    }

    @Override
    public void draw() {
	logger.info(new StringBuilder(32).append("Drawing image ").append(this.fileName));

    }

}
