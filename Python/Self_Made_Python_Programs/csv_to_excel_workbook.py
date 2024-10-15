import pandas as pd
import os

path = input('Enter the relative / absolute path of the CSV file : ')

# extract the filename without extension

filename = os.path.basename(path).split(".")[0]
# print(filename)

# extract the preceeding path from the path (remove the filename)

path_list = path.split("\\")
path_list.pop()

preceeding_path = "\\".join(path_list)
# print(preceeding_path)

# convert the excel csv file to excel workbook file

try:

	csv_df = pd.read_csv(path)

	destination_path = preceeding_path + "\\" + filename + ".xlsx"

	csv_df.to_excel(destination_path, index=False)

except(FileNotFoundError) as e:

	print(e)

else:

	print("File Converted Successfully...")
	print("File saved at path :", destination_path)