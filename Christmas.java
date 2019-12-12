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
		for(int i = 0; i < elves.size(); i++)
		{
			System.out.println(elves.get(i));
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
}
