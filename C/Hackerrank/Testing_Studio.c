#include <stdio.h>

int main(void) {
	// your code goes here
	int t,i,x,y,z,net_books,min_boxes;
	scanf("%d",&t);
	while(t--)
	{
	    scanf("%d%d%d",&x,&y,&z);
	    net_books=x*y;
	    min_boxes=net_books/z;
	    printf("%d\n",min_boxes);
	}
	return 0;
}

//#include <stdio.h>
//
//int main(){
//	int n,i,a[100],b[100],count;
//	scanf("%d",&n);
//	for(i=0;i<5;i++)
//	{
//		scanf("%d",&a[i]);
//		scanf("%d",&b[i]);
//	}
//	while(a[i]!=b[i])
//	{
//		i=0;
//		a[i]=a[i]-b[i];
//		count++;
//		i++;
//	}
//	for(i=0;i<5;i++)
//	{
//		if(a[i]==b[i])
//		{
//			printf("-1");
//		}
//		else
//		{
//			printf("%d",count);
//		}
//	}
//	return 0;
//}


//#include <stdio.h>
//int main(void) {
//	// your code goes here
//	int t,i,j,n,flag;
//	char s[1024];
//	scanf("%d",&t);
//	for(j=1;j<=t;j++)
//	{
//	    flag=0;
//	    /*flag is initialized as '0 in the loop because it has to be initialized
//	    multiple times because of 'n' number of test cases to be used*/
//	    scanf("%d",&n);
//	    scanf("%s",s);
//	    for(i=0;i<n/2;i++)
//	    {
//	        if(s[i]!=s[i+n/2])
//	        {
//	            flag=1;
//	        }
//	    }
//	    if(flag==1)
//	    {
//	        printf("NO\n");
//	    }
//	    else
//	    {
//	        printf("YES\n");
//	    }
//	}
//	return 0;
//}

//#include <stdio.h>
//
//int main(void) {
//	// your code goes here
//	int t,x,y,i;
//	scanf("%d",&t);
//	for(i=1;i<=t;i++)
//	{
//	    scanf("%d%d",&x,&y);
//	    if(x>y)
//	    {
//	        printf("A\n");
//	    }
//	    else if(y>x)
//	    {
//	        printf("B\n");
//	    }
//	}
//	return 0;
//}

//#include <stdio.h>
//
//int main(void) {
//	// your code goes here
//	int t,i,j,n,a[1000],max;
//	scanf("%d",&t);
//	for(i=1;i<=t;i++)
//	{
//	    scanf("%d",&n);
//	    max=0;
//	    for(j=1;j<=n;j++)
//	    {
//	        scanf("%d",&a[j]);
//	        if(a[j]>max)
//	        {
//	            max=a[j];
//	        }
//	    }
//	    printf("%d\n",max);
//	}
//	return 0;
//}


//#include <stdio.h>
//
//int main(void) {
//	// your code goes here
//	int i,t,n,x,y;
//	scanf("%d",&t);
//	for(i=1;i<=t;i++)
//	{
//	    scanf("%d%d%d",&n,&x,&y);
//	    if(y%x==0)
//	    {
//	        printf("Yes\n");
//	    }
//	    else
//	    {
//	        printf("No\n");
//	    }
//	}
//	return 0;
//}
//#include <stdio.h>
//
//int main(void) {
//	// your code goes here
//	int max,min,t,i,a,b,c,diff;
//	scanf("%d",&t);
//	for(i=1;i<=t;i++)
//	{
//	    scanf("%d%d%d",&a,&b,&c);
//	    max=c;
//	    min=a;
//	    diff=max-min;
//	    printf("%d\n",diff);
//	}
//	return 0;
//}
//#include <stdio.h>
//#include <string.h>
//#include <math.h>
//#include <stdlib.h>
////Complete the following function.
//
//
//void calculate_the_maximum(int n, int k) {
//  //Write your code here.
//  int i,m[100],max_and=0,max_or=0,max_xor=0;
//  int and[10],or[10],xor[10];
//  for(i=1;i<=n;i++)
//  {
//    m[i]=i;
//    and[i]=m[i]&m[i+1];
//    if((and[i]>max_and)&&(and[i]<k))
//    {
//        max_and=and[i];
//    }
//    or[i]=m[i]|m[i+1];
//    if((or[i]>max_or)&&(or[i]<k))
//    {
//        max_or=or[i];
//    }
//    xor[i]=m[i]^m[i+1];
//    if((xor[i]>max_xor)&&(xor[i]<k))
//    {
//        max_xor=xor[i];
//    }
//  }
//  printf("%d\n%d\n%d\n",max_and,max_or,max_xor);
//}
//
//int main() {
//    int n, k;
//  
//    scanf("%d %d", &n, &k);
//    calculate_the_maximum(n, k);
// 
//    return 0;
//}

//#include <stdio.h>
//#include <stdlib.h>
//#define MAX_HEIGHT 41
//
//struct box
//{
//	/**
//	* Define three fields of type int: length, width and height
//	*/
//    int length,width,height;
//};
//
//typedef struct box box;
//
//int get_volume(box b) {
//	/**
//	* Return the volume of the box
//	*/
//    int volume=b.length*b.width*b.height;
//    return volume;
//}
//
//int is_lower_than_max_height(box b) {
//	/**
//	* Return 1 if the box's height is lower than MAX_HEIGHT and 0 otherwise
//	*/
//    int n;
//    if(b.height<MAX_HEIGHT)
//    {
//    	return 1;
//    }
//    else
//    {
//        return 0;
//    }
//}
//
//int main()
//{
//	int n;
//	scanf("%d", &n);
//	box *boxes = malloc(n * sizeof(box));
//	for (int i = 0; i < n; i++) {
//		scanf("%d%d%d", &boxes[i].length, &boxes[i].width, &boxes[i].height);
//	}
//	for (int i = 0; i < n; i++) {
//		if (is_lower_than_max_height(boxes[i])) {
//			printf("%d\n", get_volume(boxes[i]));
//		}
//	}
//	return 0;
//}
//#include <stdio.h>
//#include <string.h>
//#include <math.h>
//#include <stdlib.h>
////Complete the following function.
//
//
//void calculate_the_maximum(int n, int k) {
//  //Write your code here.
//  int i,m[100],max_and=0,max_or=0,max_xor=0;
//  int and[10],or[10],xor[10];
//  for(i=1;i<=n;i++)
//  {
//    m[i]=i;
//    and[i]=m[i]&m[i+1];
//    or[i]=m[i]|m[i+1];
//    xor[i]=m[i]^m[i+1];
//    if(and[i]>max_and&&max_and<k)
//    {
//        max_and=and[i];
//    }
//    if(or[i]>max_or&&max_or<k)
//    {
//        max_or=or[i];
//    }
//    if(xor[i]>max_xor&&max_xor<k)
//    {
//        max_xor=xor[i];
//    }
//	printf("%d",max_and);
//	printf("%d",max_or);
//	printf("%d",max_xor);
//  }
//}
//
//int main() {
//    int n, k;
//  
//    scanf("%d %d", &n, &k);
//    calculate_the_maximum(n, k);
// 
//    return 0;
//}

//#include <stdio.h>
//#include <string.h>
//#include <math.h>
//#include <stdlib.h>
//
////Complete the following function.
//
//int marks_summation(int* marks, int number_of_students, char gender) 
//{
// //Write your code here.
// int sum=0;
// int i;
// char b,g;
// if(gender==b)
// {
//     for(i=0;i<number_of_students;i++)
//     {
//        if(i%2==0)
//        {
//            sum=sum+marks[i];
//        }
//     }
// }
//  if(gender==g)
// {
//     for(i=0;i<number_of_students;i++)
//     {
//        if(i%2!=0)
//        {
//            sum=sum+marks[i];
//        }
//     }
// }
//}
//
//int main() {
//    int number_of_students;
//    char gender;
//    int sum;
//  
//    scanf("%d", &number_of_students);
//    int *marks = (int *) malloc(number_of_students * sizeof (int));
// 
//    for (int student = 0; student < number_of_students; student++) {
//        scanf("%d", (marks + student));
//    }
//    
//    scanf(" %c", &gender);
//    sum = marks_summation(marks, number_of_students, gender);
//    printf("%d", sum);
//    free(marks);
// 
//    return 0;
//}
//#include <stdio.h>
//#include <string.h>
//#include <math.h>
//#include <stdlib.h>
////Complete the following function.
//
//int find_nth_term(int n, int a, int b, int c)
//{
//  //Write your code here.
//  int S[100];
//  S[1]=a;
//  S[2]=b;
//  S[3]=c;
//  int i;
//  for(i=4;i<=n;i++)
//  {
//    S[i]=S[i-1]+S[i-2]+S[i-3];
//  }
//  return S[n];
//}
//
//int main() {
//    int n, a, b, c;
//  
//    scanf("%d %d %d %d", &n, &a, &b, &c);
//    int ans = find_nth_term(n, a, b, c);
// 
//    printf("%d", ans); 
//    return 0;
//}
//#include <stdio.h>
//#include <stdlib.h>
//#define MAX_HEIGHT 41
//
//struct box
//{
//	/**
//	* Define three fields of type int: length, width and height
//	*/
//    int length,width,height;
//};
//
//typedef struct box box;
//
//int get_volume(box b) {
//	/**
//	* Return the volume of the box
//	*/
//    int volume=length*width*height;
//    return volume;
//}
//
//int is_lower_than_max_height(box b) {
//	/**
//	* Return 1 if the box's height is lower than MAX_HEIGHT and 0 otherwise
//	*/
//    MAX_HEIGHT=41
//    if(MAX_HEIGHT > height)
//    {
//        return 1;
//    }
//}
//
//int main()
//{
//	int n;
//	scanf("%d", &n);
//	box *boxes = malloc(n * sizeof(box));
//	for (int i = 0; i < n; i++) {
//		scanf("%d%d%d", &boxes[i].length, &boxes[i].width, &boxes[i].height);
//	}
//	for (int i = 0; i < n; i++) {
//		if (is_lower_than_max_height(boxes[i])) {
//			printf("%d\n", get_volume(boxes[i]));
//		}
//	}
//	return 0;
//}
/* #include <stdio.h>
#include<stdlib.h>
void update(int *a,int *b) 
{
    int sum,diff;
    sum = *a + *b;
    diff = abs(*a - *b);
    /*abs is a function used to return absolute value 
	of the given number,if it is a complex number,it returns its magnitude
    *a = sum;
    *b = diff;
}

int main() 
{
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    /*we can also use pa and pb here because they mean the same
    update(pa, pb);
    /*we can also use &a and &b here because they mean the same
    printf("%d\n%d", a, b);
    return 0;
}*/
/*#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char num[1024];
    scanf("%s",num);
    char cmp[10]={'0','1','2','3','4','5','6','7','8','9'};
    int i,j,len,count[1000];
    len = strlen(num);
    for(i=0;i<=9;i++)
    {
        count[i]=0;
        for(j=0;j<len;j++)
        {
            if(num[j]==cmp[i])
            {
                count[i]++;
            }
        }
    printf("%d ",count[i]);
    }
    return 0;
}*/
/*#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    int len = strlen(s);
    int i;
    for(i=0;i<=len-1;i++)
    {
        if(s[i]==' ')
        {
            printf("\n");
        }
        else
        {
            printf("%c",s[i]);
        }
    }
    free(s);
    return 0;
}*/
/*
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	int n,i,sum=0;
	scanf("%d",&n);
    int *arr = (int*)malloc(n * sizeof(int));
    for(i=0;i<n;i++)
    {   
        scanf("%d",&arr[i]);
        sum=sum+arr[i];
    }
    printf("%d",sum);
    free(arr);
    return 0;
}*/
/*#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, arr[1000], i;
    scanf("%d", &num);
    for(i = 0; i < num; i++) 
	{
        scanf("%d", &arr[i]);
    }
    
    logic to reverse the array.
    for(i = num; i > 0; i--)
    {
        printf("\n%d ", arr[i-1]);
 	}
        
    return 0;
}*/
/*#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	printf("%d",n%100/1);
	return 0;
}*/
/*
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
    
  	if(a==1)
      {
          printf("one");
          printf("\ntwo");
      }

    if(a==2)
      {
          printf("two");
          printf("\nthree");
      }
      
    if(a==3)
      {
          printf("three");
          printf("\nfour");
      }
     
    if(a==4)
      {
          printf("four");
          printf("\nfive");
      }
      
    if(a==5)
      {
          printf("five");
          printf("\nsix");
      }
    
     if(a==6)
      {
          printf("six");
          printf("\nseven");
      }
      
      if(a==7)
      {
          printf("seven");
          printf("\neight");
      }
      
      if(a==8)
      {
          printf("eight");
          printf("\nnine");
      }       
      
      if(a>9)
      {
          if(a%2==0)
          {
              printf("\neven");
              printf("\nodd");
          }
          else
          {
              printf("\nodd");
              printf("\neven");
          }
      }
      
    if(b==1)
      {
          printf("one");
          printf("\ntwo");
      }

    if(b==2)
      {
          printf("two");
          printf("\nthree");
      }
      
    if(b==3)
      {
          printf("three");
          printf("\nfour");
      }
     
    if(b==4)
      {
          printf("four");
          printf("\nfive");
      }
      
    if(b==5)
      {
          printf("five");
          printf("\nsix");
      }
      
     if(b==6)
      {
          printf("six");
          printf("\nseven");
      }
      
      if(b==7)
      {
          printf("seven");
          printf("\neight");
      }
      
      if(b==8)
      {
          printf("eight");
          printf("\nnine");
      }       
      
      if(b>9)
      {
          if(b%2==0)
          {
              printf("\neven");
              printf("\nodd");
          }
          else
          {
              printf("\nodd");
              printf("\neven");
          }
      }  
      
    return 0;
}
*/
/*     
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{	
    int n;
    scanf("%d",&n);
	printf("%d",n%10/1 + n%100/10 + n%1000/100 + n%10000/1000 + n%100000/10000);
    return 0;
}
*/
/*#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n,sum=0;
    int p,a;
    scanf("%d", &n);
    
	for(p=1;p<5;p++)
    {
    	a = pow(10,p)/pow(10,p-1);
        sum = n%a;
        sum = sum+p;
    }
    printf("%d",sum);
    return 0;
}*/
