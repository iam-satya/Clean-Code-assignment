package com.cost;

public class StandardMaterialType extends CostEstimation

{

	float StandardMaterial=1200;
	float ConstructionCost;

	public float MaterialType(float Area)

	{
		 ConstructionCost=StandardMaterial*Area;
		 return ConstructionCost;
	}
}
