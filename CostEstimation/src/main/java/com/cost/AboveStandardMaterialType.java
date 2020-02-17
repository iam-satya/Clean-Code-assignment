package com.cost;

public class AboveStandardMaterialType extends CostEstimation
{

	float AboveStandardMaterial=1500;
	float ConstructionCost;

	public float MaterialType(float Area)

	{
		 ConstructionCost=AboveStandardMaterial*Area;
		 return ConstructionCost;
	}
	
	
}
