public static void main(String[] args) {
		
		String a[] = {"string search","java string search","manual c++ string search equals",
					  "java search code","c++ java code search" };
		
		String pattern = "java search";
		HashMap patternMap = new HashMap();
		HashSet<String> set = new HashSet<String>();		
		ArrayList lst = getTokens(pattern);
		ArrayList tokens = new ArrayList();
		
		// to convert the pattern to Map.
		for(int i = 0 ; i < lst.size(); i++)
			patternMap.put(lst.get(i),0);
		
		for(int i = 0; i < a.length; i++)
		{
			set.clear();
			tokens = getTokens(a[i]);
			for (int j = 0 ; j < tokens.size(); j++)
				if(patternMap.containsKey(tokens.get(j)))
					set.add(String.valueOf(tokens.get(j)));
			
			if(patternMap.size() == set.size())
				System.out.println(a[i] + ": candiate of result");
		}
	}
	
	public static ArrayList getTokens(String value)
	{
		StringTokenizer ls = new StringTokenizer(value);
		ArrayList<String> tokens = new ArrayList<String>();
		while (ls.hasMoreTokens())
			tokens.add(ls.nextToken());
		return tokens;
	}