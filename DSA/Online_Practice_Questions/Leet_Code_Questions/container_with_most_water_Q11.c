#include<stdio.h>

int maxArea(int* height, int heightSize)
{
    int i,distance,max_h,index_m_h,min_h,s_max_h,index_s_m_h,max_distance,h_bound1,h_bound2,max_capacity;

    max_h=min_h=height[0];

    for(i=1;i<heightSize;i++)
    {
        if(height[i]>max_h)
        {
            max_h=height[i];
            index_m_h=i;
        }

        if(height[i]<min_h)
        {
            min_h=height[i];
        }

        s_max_h=min_h;

        if(height[i]>=s_max_h)
        {
            s_max_h=height[i];
            index_s_m_h=i;
        }

        if(index_m_h>index_s_m_h)
        {
            distance = index_m_h - index_s_m_h;
        }
        else
        {
            distance = index_s_m_h - index_m_h;
        }

        max_distance=0;

        if(distance>max_distance)
        {
            max_distance=distance;
        }
    }

	max_capacity=max_distance*max_distance;

    return max_capacity;
}

int main()
{
	int height[] = {1,2,1};
	int heightSize = sizeof(height)/sizeof(height[0]);

	
	printf("Max Capacity : %d",maxArea(height,heightSize));
	
	return 0;
}