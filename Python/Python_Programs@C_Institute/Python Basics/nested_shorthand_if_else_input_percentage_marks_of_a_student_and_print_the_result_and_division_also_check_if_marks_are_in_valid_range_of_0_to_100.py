p_marks = int(input("Enter the percentage marks obtained : "))

# result = "Marks input out of range of 0 to 100" if p_marks<0 or p_marks>100 else\
# 		"1st Division" if p_marks>=60 and p_marks<=100 else\
# 		"2nd Division" if p_marks>=45 and p_marks<=59 else\
# 		"3rd Division" if p_marks>=33 and p_marks<=44 else\
# 		"Fail"

result = "Marks input out of range of 0 to 100" if p_marks<0 or p_marks>100 else\
		 "1st Division" if p_marks>=60 else\
		 "2nd Division" if p_marks>=45 else\
		 "3rd Division" if p_marks>=33 else\
		 "Fail"

print(result)