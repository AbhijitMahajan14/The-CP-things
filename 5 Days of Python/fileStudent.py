print("Enter student names :")
while True:
	sn=input("")
	if sn=="stop":
		break
	else:
		f=open("student.txt","a")
		f.write(sn)
		f.write("\n")
f.close()