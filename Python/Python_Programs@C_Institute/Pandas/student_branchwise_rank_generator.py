import pandas as pd

df = pd.read_csv('cse_students_cgpa_data.csv')

df = df.sort_values(by='CGPA', ascending=False)

total_no_of_students = df.shape[0] # returns a tuple representing the dimensionality of the frame

# r_no_last_2_digits = int(input("\nEnter the last two digits of your roll number :"))

ranks = [x for x in range(1, total_no_of_students + 1)]

df = df.assign(Rank=ranks)

print(df)

# print("\nThe Top 10 Students of CSE branch are : ")

# print(df['Roll Number'][0])