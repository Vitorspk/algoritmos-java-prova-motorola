package Arraymultidimensionais.Bidimencionais;

public class ExemploG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		int nums1[] = new int[10];
		int nums2[] = new int[10];
		
		for(i=0; i<10; i++)
			nums1[i] = i;
		
		for(i=0; i<10; i++)
			nums2[i] = -i;
		
		
		System.out.print("Here is nums1 : ");
		for(i=0; i<10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();
		
		System.out.print("Here is nums2 : ");
		for(i=0; i<10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
		
		
		nums2 = nums1; //agora nums2 referencia nums1;
		
		System.out.print("Here is nums2 after assignment: ");
		for(i=0; i <10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
		
		//agora opera do array nums1 ao nums2
		nums2[3] = 99;
		
		
		System.out.print("Here is nums1 after change through num2: ");
		for(i=0; i < 10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();
		
	}

}
