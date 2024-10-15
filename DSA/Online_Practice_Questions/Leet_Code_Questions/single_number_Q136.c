#include<stdio.h>

// Brute force approach using 2 nested loops, O(n^2) time complexity and O(1) space complexity

//int singleNumber(int* nums, int numsSize)
//{
//    int i,target,freq,k,single_num;
//
//    for(i=0;i<numsSize;i++)
//    {
//        freq=0;
//        
//        for(k=0;k<numsSize;k++)
//        {
//            //consider nums[i] as target
//            if(nums[k]==nums[i])
//            {
//                freq++;
//            }
//        }
//
//        if(freq==1)
//        {
//            single_num=nums[i];
//        }
//    }
//
//    return single_num;
//}

// Most Optimised approach using single loop and XOR operator, O(n) or Linear time complexity and O(1) or Constant space complexity

// Code

int singleNumber(int* nums, int numsSize)
{
    int single_num=0;

    for(int i=0;i<numsSize;i++)
    {
        single_num = single_num ^ nums[i];
        // printf("%d ",single_num);
    }

    return single_num;
}

//Intuition

//Thinking of a brute force approach, using a nested loop to determine the element with single occurence will come to our mind in the first place, but it will be of O(n^n) time complexity.
//
//Since we have to perform this in the most optimised way using linear O(n) time complexity.
//
//So, we will have to use some method which can neglect duplicate values and only accept or store unique values.

//Approach

//Remember, XOR operator compares two bits and returns 1 if they are different and returns 0 if they are same, we can use the same approach here to neglect the duplicate values and store the unique values.

//Algorithm :

//1. Initialize a variable single_num to 0.
//2. Iterate through each element of the array nums.
//3. Update the value of single_num on each iteration by performing XOR operation b/w single_num and that particular element of the array nums.
//4. Repeat the step 3 until you have iterated over the last element of the array.
//5. After the last element of the array is iterated over, and step 3 is performed on it, ie., after the loop gets terminated, the value of single_num will hold the element that appears only once in the array.


//# Complexity

//- Time complexity : O(n)
//
//- This algorithm has a linear runtime complexity of O(n), where n is the number of elements in the array.
//
//
//- Space complexity : O(1)
//
//- This algorithm uses constant extra space since it only requires a single variable (single_num) to store the result of the XOR operation.

int main()
{
	int nums[5]={4,5,5,2,2};
	
	printf("%d",singleNumber(nums,5));
	
	return 0;
}