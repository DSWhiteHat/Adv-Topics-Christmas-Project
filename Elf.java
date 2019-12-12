package Christmas;

public class Elf
{
	private int id;
	private boolean[] toys;
	private int startTime;
	private int endTime;
	private int rate;
	
	public Elf(int id, boolean[] toys, int startTime, int endTime, int rate)
	{
		this.id = id;
		this.toys = toys;
		this.startTime = startTime;
		this.endTime = endTime;
		this.rate = rate;
	}
	
	public String toString()
	{
		String out = "";
		out += "ID: " + id;
		out += "\nToys made: ";
		
		for(int i = 0; i < toys.length; i++)
		{
			if(toys[i])
			{
				out += "1";
			}
			else
			{
				out += "0";
			}
		}
		
		out += "\nStart Time: " + startTime;
		out += "\nEnd Time: " + endTime;
		out += "\nRate: " + rate;
		
		return out;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public boolean[] getToys()
	{
		return toys;
	}

	public void setToys(boolean[] toys)
	{
		this.toys = toys;
	}

	public int getStartTime()
	{
		return startTime;
	}

	public void setStartTime(int startTime)
	{
		this.startTime = startTime;
	}

	public int getEndTime()
	{
		return endTime;
	}

	public void setEndTime(int endTime)
	{
		this.endTime = endTime;
	}

	public int getRate()
	{
		return rate;
	}

	public void setRate(int rate)
	{
		this.rate = rate;
	}
}
