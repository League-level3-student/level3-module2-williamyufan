package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggss) {

		for (int i = 0; i < eggss.size(); i++) {
			if (eggss.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;

	}

	public static int countPearls(List<Boolean> oysters) {

		int w = 0;

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {

				w += 1;

			}

		}

		return w;

	}

	public static double findTallest(List<Double> y) {

		Double p = 0.0;

		for (int i = 0; i < y.size(); i++) {
			if (y.get(i) > p) {
				p = y.get(i);
			}
		}

		return p;

	}

	public static String findLongestWord(List<String> words) {

		String a = "";

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > a.length()) {

				a = words.get(i);

			}
		}

		return a;

	}

	public static boolean containsSOS(List<String> morseCodes) {

		String w = "... --- ...";
		for (int i = 0; i < morseCodes.size(); i++) {

			if (morseCodes.get(i).contains(w)) {
				return true;
			}

		}

		return false;

	}

	public static List<Double> sortScores(List<Double> scores) {

		for (int j = 0; j < scores.size(); j++) {

			for (int i = j + 1; i < scores.size(); i++) {
				if (scores.get(i) < scores.get(j)) {
					double g = scores.get(j);
					scores.set(j, scores.get(i));
					scores.set(i, g);

				}
			}
		}

		return scores;

	}

	public static List<String> sortDNA(List<String> DNA) {

		for (int i = 0; i < DNA.size(); i++) {
			for (int j = i + 1; j < DNA.size(); j++) {
				if (DNA.get(j).length()<DNA.get(i).length()) {
					String g = DNA.get(i);
					DNA.set(i, DNA.get(j));
					DNA.set(j, g);

				}
			}

		}

		return DNA;

	}
public static List<String> sortWords(List<String> words){
	
	for (int i = 0; i < words.size(); i++) {
		for (int j = i + 1; j < words.size(); j++) {
			if (words.get(j).compareTo(words.get(j))>0) {
				String g = words.get(i);
				words.set(i, words.get(j));
				words.set(j, g);

			}
		}

	}
	
	return words;
	
}
}

