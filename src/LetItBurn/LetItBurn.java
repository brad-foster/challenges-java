package LetItBurn;

public class LetItBurn {
	public static void main(String[] args) {
		String[][] house = {
			{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "/", "#"},
			{"#", " ", " ", " ", " ", " ", " ", "|", " ", " ", " ", " ", " ", " ", "#"},
			{"#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", "#"},
			{"#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", "#"},
			{"#", "#", "#", "#", "#", "#", "#", "#", " ", " ", " ", " ", " ", " ", "#"},
			{"#", " ", " ", " ", " ", " ", " ", "_", " ", " ", " ", " ", " ", " ", "#"},
			{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}
		};
		
		int[][] coordinates = {
			{1,1}, {1,2}, {1,3}, {5,6}, {5,2}, {1,1}, {1,2}, {5,5}, {5,5}, {5,1}, {5,9}, {2,2}
		};
		
		printHouse(house);
		
		for(int c = 0; c < coordinates.length; c++){
			int x = coordinates[c][0];
			int y = coordinates[c][1];
			house[x][y] = "S";
		}
		
		printHouse(house);
	}
	
	public static void printHouse(String[][] args) {
		for(int i = 0; i < args.length; i++){
			StringBuilder sb = new StringBuilder();
			for(int x = 0; x < args[i].length; x++){
				sb.append(args[i][x]);
			}
			System.out.println(sb);
		}
		System.out.println("");
	}
}