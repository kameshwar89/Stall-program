package com.secondhand3;

public class Stall {
	protected String name,detail,ownerName;

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double computeCost(String stallType,int squareFeet)
	{
		if(stallType.compareTo("Platinum")==0)
			return (200*squareFeet);
		else if(stallType.compareTo("Gold")==0)
			return (100*squareFeet);
		else
			return (150*squareFeet);
	}
	public double computeCost(String stallType,int squareFeet,int numberofTV)
	{
		if(stallType.compareTo("Platinum")==0)
			return ((200*squareFeet)+(numberofTV*10000));
		else if(stallType.compareTo("Gold")==0)
			return ((100*squareFeet)+(numberofTV*10000));
		else
			return ((150*squareFeet)+(numberofTV*10000));
	}

}
