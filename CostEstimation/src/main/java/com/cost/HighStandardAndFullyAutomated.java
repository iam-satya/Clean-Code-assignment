package com.cost;

public class HighStandardAndFullyAutomated  extends CostEstimation
{

	float  HighStandardAndFullyAutomatedType=2500;
	float ConstructionCost;

	public float MaterialType(float Area)

	{
		 ConstructionCost=  HighStandardAndFullyAutomatedType*Area;
		 return ConstructionCost;
	}
}
