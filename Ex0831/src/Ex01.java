
public class Ex01 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(num);
		
		//인덱스: 0부터 시작  
		//int[] nums = new int[3];
		
		//왜 0인가?? new라는 키워드를 사용해서 메모리를 할당하면 기본적으로 자바에서 최소값으로 초기화해줌.
//		System.out.println(nums[0]);
		
		//배열 내 데이터 초기화
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
		//어떤 데이터를 넣을 것인지 알고 있을 
		int[] nums = {1,2,3};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
