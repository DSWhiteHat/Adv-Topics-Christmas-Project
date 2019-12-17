package Christmas;

public class Toy
{
	private String name;
	private int constructionTime;
	private int firstOrder;
	private int secondOrder;
	private int thirdOrder;
	
	public Toy(String name, int constructionTime, int firstOrder, int secondOrder, int thirdOrder)
	{
		this.name = name;
		this.constructionTime = constructionTime;
		this.firstOrder = firstOrder;
		this.secondOrder = secondOrder;
		this.thirdOrder = thirdOrder;
	}
	
	public String toString()
	{
		String out = name + ":\n";
		
		out += "\tConstruction Time: " + constructionTime + "\n";
		out += "\tAmount in First Order: " + firstOrder + "\n";
		out += "\tAmount in Second Order: " + secondOrder + "\n";
		out += "\tAmount in Third Order: " + thirdOrder + "\n";

		return out;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getConstructionTime() { return constructionTime; }
	public void setConstructionTime(int constructionTime) { this.constructionTime = constructionTime; }
	
	public int getFirstOrder() { return firstOrder; }
	public void setFirstOrder(int firstOrder) { this.firstOrder = firstOrder; }
	
	public int getSecondOrder() { return secondOrder; }
	public void setSecondOrder(int secondOrder) { this.secondOrder = secondOrder; }
	
	public int getThirdOrder() { return thirdOrder; }
	public void setThirdOrder(int thirdOrder) { this.thirdOrder = thirdOrder; }
}
