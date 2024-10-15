#include<stdio.h>
int main()
{
	int c1;//;where,c stands for choice
	printf("Hey!Welcome to vegetarian food menu suggestion bot!\n");
	printf("I will help you to decide what meal can you prepare today!\n");
	printf("Which type of meal would you like to have?\n");
	printf("A Heavy and satsifying meal(1) or a Light meal(2)?\nYour answer:");
	scanf("%d",&c1);
	printf("You may prepare:\n");
	if(c1==1)
	{	printf("Aloo-gobhi sabji(watery) and roti\n");
		printf("Paneer sabji and roti\n");
		printf("Veg.Biriyani\n");
		printf("Aloo parantha\n");
		printf("Kadhi and bhindi sabji with roti\n");
		printf("Moong dal and roti\n");
		printf("Dal-Chawal\n");
		printf("Baingan bharta and parantha\n");
		printf("Idli and sambhar with coconut chutney\n");
		printf("Rajma-Chawal with roti\n");
		printf("Aloo baingan with roti");
	}
	else
	{
		printf("Upma\n");
		printf("Khichdi\n");
		printf("Dalia\n");
		printf("Club sandwich\n");
		printf("Instant noodles\n");	
		printf("Toasted bread and milk/coffee\n");	
		printf("Wheat pasta\n");
		printf("A bowl of seasonal fruits\n");
		printf("You may rather keep a fast and give rest to your stomach ><");
	}
	return 0;
}
