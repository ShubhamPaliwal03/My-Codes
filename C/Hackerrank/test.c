//#include<stdio.h>
//int main()
//{
//	int S[10];
//	int n,a,b,c,d;
//	scanf("%d %d %d %d",&n,&a,&b,&c);
//	S[1]=a;
//	S[2]=b;
//	S[3]=c;
//	int i;
//	for(i=4;i<=n;i++)
//	{
//		S[i]=S[i-1]+S[i-2]+S[i-3];
//	}
//	printf("%d",S[n]);
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	int i,j;
//	scanf("%d",&i);
//	scanf("%d",&j);
//	printf("%d",i%j);
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	int number_of_students;
//	int marks[1000];
//	 int sum=0;
//	 int i;
//	char gender;
//	scanf("%d",&number_of_students);
//	for(i=0;i<number_of_students;i++)
//	{
//		scanf("%d",&marks[i]);	
//	}
//	fflush(stdin);
//	scanf("%c",&gender);
//	if(gender=='b')
//	 {
//	     for(i=0;i<number_of_students;i++)
//	     {
//	        if(i%2==0)
//	        {
//	            sum=sum+marks[i];
//	        }
//	     }
//	 }
//	 if(gender=='g')
//	 {
//	     for(i=0;i<number_of_students;i++)
//	     {
//	        if(i%2!=0)
//	        {
//	            sum=sum+marks[i];
//	        }
//	     }
//	 }
//	 printf("%d",sum);
//}	 