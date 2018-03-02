package com.abouzidi.gof;

public class CalculusAdapter extends BasicCalculus implements StatisticsService {

	public float range(float max, float min) {
		return sub(max, min);
	}

	public float average(float[] values) {
		float sum = 0;
		for (float value : values) {
			sum = add(sum, value);
		}
		return div(sum, values.length);
	}

	public float sum(float[] values) {
		float sum = 0;
		for (float value : values) {
			sum = add(sum, value);
		}
		return sum;
	}

}
