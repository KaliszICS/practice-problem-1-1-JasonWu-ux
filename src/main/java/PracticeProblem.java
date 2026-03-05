public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void q1() {
		//Write question 1 code here
	}
		public static int sum2D(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    } 


	public static void q2() {
		//Write question 2 code here
	}
	public static int sumRow(int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr[row].length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}

	public static void q3() {
		//Write question 3 code here
	}
	public static int sumColumn(int[][] arr, int col) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][col];
		}
		return sum;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
