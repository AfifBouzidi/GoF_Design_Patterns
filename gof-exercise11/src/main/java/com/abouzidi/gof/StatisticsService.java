package com.abouzidi.gof;

public interface StatisticsService {

	public float range(float max, float min);

	public float average(float[] values);
	
	public float sum(float[] values);
}
