
	public static void AllPermutationOfString(String str) {
		AllPermutationOfString("", str);
	}

	private static void AllPermutationOfString(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				AllPermutationOfString(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
	}
