#include<stdio.h>
int main()
{
	 int arr1[]={10,20,30};
	 /*arr[]={10,20,30};
	 arr1{10,20,30};
	 arr1[0] stores 10
	 arr1[1] stores 20
	 arr1[2] stores 30
	 */
	 printf("The array arr1[3] is {%d,%d,%d}",arr1[0],arr1[1],arr1[2]);
	 int arr2[5]={10,20};
	 /* arr2 will have size 5
	 arr2[0] stores 10
	 arr2[1] stores 20
	 arr2[2] stores 0
	 arr2[2] stores 0
	 arr2[3] stores 0
	 arr2[4] stores 0
	 */
	 printf("\nThe array arr[5] is {%d,%d,%d,%d,%d}",arr2[0],arr2[1],arr2[2],arr2[3],arr2[4]);
	 int arr3[5]={1,2,3,4,5,6};/*Error in Turbo C and warning in Dev C++*/
	 printf("\nThe array arr3[5] is {%d,%d,%d,%d,%d,%d}",arr3[0],arr3[1],arr3[2],arr3[3],arr3[4],arr3[5]);
	 return 0;
}
