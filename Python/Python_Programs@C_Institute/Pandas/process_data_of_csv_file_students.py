import pandas as pd

df = pd.read_csv('students_data.csv')

print("\nThe Data of the 1st and 2nd row is : ")

print("\n",df.head(2))
# OR
# print("\n",df.loc[[0,1]])

print("\nThe Name of the 5th student is :",df.loc[4,'Name'])

print("\nThe Name and Age of the 7th student are :",df.loc[6,'Name'],",",df.loc[6,'Age'])

print("\nThe Roll number and Name of the 9th student are :",df.loc[8,'Roll_Number'],",",df.loc[8,'Name'])