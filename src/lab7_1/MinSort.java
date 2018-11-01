package lab7_1;

public class MinSort {
	String sort(String s) {
		if (s == null || s.length() < 1)
			return s;
		int minpos = 0;
		char minChar = s.charAt(minpos);
		for (int i = 0; i < s.length(); i++)
			minpos = (int) s.charAt(minpos) > (int) s.charAt(i) ? i : minpos;
		return s.charAt(minpos) + sort(s.substring(0, minpos) + s.substring(minpos + 1));
	}

	public static void main(String[] args) {
		MinSort m = new MinSort();
		System.out.println(m.sort("zwxuabfkafutbbbb"));
	}
}
