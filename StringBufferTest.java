package DEMO15;

public class StringBufferTest {
	public static void main(String[] args) {
		int[] arr={4,122,1,22,123};
		toString(arr);
		
	}
	
	public static void toString(int[] arr){
		StringBuffer buffer=new StringBuffer();
		buffer.append("[");
		
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				buffer.append(arr[i]).append("]");				
			}
			else {
				buffer.append(arr[i]).append(",");
			}
		}
		
		System.out.println(buffer);
	}

}
