
public  class SimpleAndCompoundInterest {

	float SimpleInterest;
	float CompoundInterest;
	float TotalAmount;
	public  float simpleInterestCalc(int PrincipleAmount,int RateofInterest,int Time)
	{
		SimpleInterest=(PrincipleAmount*RateofInterest*Time)/100;
		TotalAmount=SimpleInterest+PrincipleAmount;
		return TotalAmount;
	}
	
	public float compoundInterestCalc(int PrincipleAmount,int RateofInterest,int Time,int NumberofTimesCompounded)
		{
		CompoundInterest= PrincipleAmount*(float)(Math.pow(1+((RateofInterest/100)/NumberofTimesCompounded)/100,NumberofTimesCompounded*Time));
		return CompoundInterest;
	
		}
	
	
	
}
