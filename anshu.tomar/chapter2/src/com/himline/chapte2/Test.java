package com.himline.chapte2;

public class Test {

	private int hour;
	private int minute;
	private int second;

	public Test() {
		this.hour = 10;
		this.minute = 20;
		this.second = 45;
	}

	public Test(int h) {
		this.hour = h;
	}

	public Test(int h, int m) {
		this.hour = h;
		this.minute = m;
	}

	public Test(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public void setTime(int h, int m, int s) {

	}

	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}

	public void setMinute(int m) {

		hour = ((m >= 0 && m < 60) ? m : 0);
	}

	public void setSecond(int s) {
		hour = ((s >= 0 && s < 60) ? s : 0);

	}

	public int getHour() {
		return hour;

	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}