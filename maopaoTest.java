package maopao;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
public class maopaoTest {
	@Test
	public void test() {
		int arr[]= {0,2,1,3,4,5};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	@Test
	public void test1() {
		int arr[]= {5,3,1,2,4,0};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	
	@Test
	public void test2() {
		int arr[]= {5,2,4,3,0,1};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	@Test
	public void test3() {
		int arr[]= {2,3,5,0,1,4};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}

}
