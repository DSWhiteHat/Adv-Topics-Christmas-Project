package Christmas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Christmas
{
	public static void main(String[] args) throws IOException
	{
		List<Elf> elves = readElves();
		List<Toy> toys = readToys();
		for(int i = 0; i < toys.size(); i++)
		{
			System.out.println(toys.get(i));
		}
		
		
	}
	
	public static List<Elf> readElves() throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/cl20stebbinsd/Downloads/data_files/data files/ElfInfo.txt")));
		List<Elf> out = new ArrayList<>();
		
		String current = reader.readLine();
		while(current != null)
		{
			String[] split = current.split(" ");
			
			int id = Integer.parseInt(split[0], 2);
			
			boolean[] toys = new boolean[split[1].length()];
			for(int i = 0; i < split[1].length(); i++)
			{
				toys[i] = split[1].substring(i, i + 1).equals("1");
			}
			
			int start = Integer.parseInt(split[2]);
			int end = Integer.parseInt(split[3]);
			
			int rate = Integer.parseInt(split[4]);
			
			out.add(new Elf(id, toys, start, end, rate));
			
			current = reader.readLine();
		}
		
		reader.close();
		return out;
	}
	
	public static List<Toy> readToys() throws IOException
	{
		List<Toy> toys = new ArrayList<Toy>();
		
		List<String> names = new ArrayList<>();
		List<Integer> constructionTimes = new ArrayList<>();
		List<Integer> firstOrder = new ArrayList<>();
		List<Integer> secondOrder = new ArrayList<>();
		List<Integer> thirdOrder = new ArrayList<>();
	
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/cl20stebbinsd/Downloads/data_files/data files/ToyList.txt")));
		String current = reader.readLine();
		while(current != null)
		{
			names.add(current);
			current = reader.readLine();
		}
		
		reader = new BufferedReader(new FileReader(new File("/Users/cl20stebbinsd/Downloads/data_files/data files/ToyConstructionTime.txt")));
		String[] temp = reader.readLine().split(", ");
		
		for(int i = 0; i < temp.length; i++)
		{
			constructionTimes.add(Integer.parseInt(temp[i]));
		}
	
		reader = new BufferedReader(new FileReader(new File("/Users/cl20stebbinsd/Downloads/data_files/data files/ToyOrders.txt")));
		String[] order = reader.readLine().split(", ");;	
		for(int i = 0; i < order.length; i++)
		{
			firstOrder.add(Integer.parseInt(order[i]));
		}
		
		order = reader.readLine().split(", ");;	
		for(int i = 0; i < order.length; i++)
		{
			secondOrder.add(Integer.parseInt(order[i]));
		}
		
		order = reader.readLine().split(", ");;	
		for(int i = 0; i < order.length; i++)
		{
			thirdOrder.add(Integer.parseInt(order[i]));
		}
		
		for(int i = 0; i < names.size(); i++)
		{
			toys.add(new Toy(names.get(i), constructionTimes.get(i), firstOrder.get(i), secondOrder.get(i), thirdOrder.get(i)));
		}
		
		return toys;
	}
}
