package Week1.Day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
							if(arr[i] == arr[j]) {
								count =j;
							} else {
								continue;
							}
			}
			if(count>0) {
			System.out.println(arr[count]);
			count=0;
		}else {continue;
		}
		}
		}
	}
