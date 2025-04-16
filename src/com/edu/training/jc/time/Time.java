package com.edu.training.jc.time;

public class Time {

	private int hour;
	private int minut;
	private int second;

	public Time() {
		this.hour = 0;
		this.minut = 0;
		this.second = 0;
	}

	public Time(int hour, int minut, int second) {

		if (hour >= 24 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
		if (minut >= 60 || minut < 0) {
			this.minut = 0;
		} else {
			this.minut = minut;
		}
		if (second >= 60 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public void setMinut(int minut) {
		if (minut >= 60 || minut < 0) {
			this.minut = 0;
		} else {
			this.minut = minut;
		}
	}

	public int getMinut() {
		return this.minut;
	}

	public void setSecond(int second) {
		if (second >= 60 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public int getSecond() {
		return this.second;
	}

	public void hourAdd(int hour) {
		this.hour += hour;
		while (this.hour >= 24) {
			this.hour -= 24;
		}
	}

	public void minutAdd(int minut) {
		this.minut += minut;
		while (this.minut >= 60) {
			hourAdd(1);
			this.minut -= 60;
		}
	}

	public void secondAdd(int second) {
		this.second += second;
		while (this.second >= 60) {
			minutAdd(1);
			this.second -= 60;
		}
	}

	public void hourSubtract(int hour) {
		this.hour -= hour;
		while (this.hour < 0) {
			this.hour += 24;
		}
	}

	public void minutSubtract(int minut) {
		this.minut -= minut;
		while (this.minut < 0) {
			hourSubtract(1);
			this.minut += 60;
		}
	}

	public void secondSubtract(int second) {
		this.second -= second;
		while (this.second < 0) {
			minutSubtract(1);
			this.second += 60;
		}
	}

	@Override
	public String toString() {
		return "Time [hour = " + this.hour + ", minut = " + this.minut + ", second = " + this.second + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (this.hour != other.hour)
			return false;
		if (this.minut != other.minut)
			return false;
		if (this.second != other.second)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minut;
		result = prime * result + second;
		return result;
	}

}
