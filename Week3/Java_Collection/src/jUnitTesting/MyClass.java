package jUnitTesting;

public class MyClass {

	public boolean search(int[] arr, int b){
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == b) {
				return true;
			}
		}
		return false;
	}

}
