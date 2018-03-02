package com.abouzidi.gof;

public class CalculusAdapter implements StatisticsService {

	private BasicCalculus basicCalculus;

	public CalculusAdapter(BasicCalculus basicCalculus) {
		this.basicCalculus = basicCalculus;
	}

	public float range(float max, float min) {
		return basicCalculus.sub(max, min);
	}

	public float average(float[] values) {
		float sum = 0;
		for (float value : values) {
			sum = basicCalculus.add(sum, value);
		}
		return basicCalculus.div(sum, values.length);
	}

	public float sum(float[] values) {
		float sum = 0;
		for (float value : values) {
			sum = basicCalculus.add(sum, value);
		}
		return sum;
	}

}
