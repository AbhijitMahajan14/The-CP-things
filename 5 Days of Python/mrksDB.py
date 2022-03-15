name1=input("Enter file name :")
d=open(name1,"a")
print("1.Add student")
print("2.Check Result")
while True:
	ch=input("Enter your choice :")
	if ch=="stop":
		break
	elif ch=="1":
		id=input("Enter Id :")
		name=input("Enter Name :")
		m1=input("Enter M1 marks :")
		m2=input("Enter M2 marks :")
		m3=input("Enter M3 marks :")
		d.write(id)		
		d.write(":")		
		d.write(name)
		d.write(":")
		d.write(m1)
		d.write(":")
		d.write(m2)
		d.write(":")
		d.write(m3)
		d.write("\n")
	elif ch=="2":
		d=open(name1,"r")
		lst=d.readlines()
		j=0
		n=""
		for i in lst:
			lst2=list()
			lst2=i.split(":")
			if int(lst2[2])+int(lst2[3])+int(lst2[4]) >135:
				print(lst2[1],":"," PASS")
			else:
				print(lst2[1],":"," FAIL")
			
		
d.close()

		

