package com.cost;

public class HighStandardMaterialType extends CostEstimation
{

	float HighStandardMaterial=1800;
	float ConstructionCost;

	public float MaterialType(float Area)

	{
		 ConstructionCost=HighStandardMaterial*Area;
		 return ConstructionCost;
	}
}
