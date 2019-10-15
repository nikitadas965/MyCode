import java.util.HashMap;

public class CountTheNumberOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*HashMap<Character,Integer> map = new HashMap<>();
		String str1= "Nikita Das";
		String str=str1.trim();
		char chararr[] = str.toCharArray(); 
		for(char c:chararr)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		 */

		HashMap<Integer,Integer> map = new HashMap<>();
		Integer intarr[] = {10, 34, 5, 10, 3, 5, 10}; 
		for(Integer key:intarr)

		{
			Integer value = map.get(key);
			if(map.get(key)==null)
			{
				map.put(key, 1);
			}
			else
			{
				map.put(key, ++value);
			}

		}
		System.out.println(map);



	}

}
