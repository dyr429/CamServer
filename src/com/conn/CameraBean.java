package com.conn;

public class CameraBean {
	int cameraID;
	int type;
	int height;
	boolean active;
	int orientation;
	int comfirmtimes;
	int confidence;
	
	
	public int getCameraID() {
		return cameraID;
	}
	public void setCameraID(int cameraID) {
		this.cameraID = cameraID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getOrientation() {
		return orientation;
	}
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	public int getComfirmtimes() {
		return comfirmtimes;
	}
	public void setComfirmtimes(int comfirmtimes) {
		this.comfirmtimes = comfirmtimes;
	}
	public int getConfidence() {
		return confidence;
	}
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}

}
