class Solution {
	ArrayList<Integer> nthRowOfPascalTriangle(int n) {
		// code here
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		res.add(new ArrayList<>(Arrays.asList(1)));
		for (int i = 1; i <= n ; i++) {
		    ArrayList<Integer> al=new ArrayList<>();
			for (int j = 0 ; j <= i; j++) {
				if (j == 0 || j == i) 
				al.add(1);
				else
				  al.add(res.get(i-1 ).get(j - 1) + res.get(i-1 ).get(j));
				
			
			}
				res.add(al);
				
		}
		return res.get(n-1);
	}
	
}
