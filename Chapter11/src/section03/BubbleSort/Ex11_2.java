package section03.BubbleSort;

public class Ex11_2 {
	public static void main(String[] args) {
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		Sort S = new Sort();
		
		System.out.print("정렬할 원소 : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		S.bubbleSort(a);
	}
}