empDB=dict()
lst=[]
i=0
j=0
print("=============-----EMP DB-----==========")
print("1.Add Details")
print("2.view Database")
print("3.Exit")
while j==0:
	ch=input("Enter choice : ")
	if ch=="stop":
		break
	elif ch=="2":
		print(empDB)
	elif ch=="1":
		name=input("Enter employee name : ")
		n=int(input("Enter number of Contacts : "))
		#empDB.append(name)
		while i<n:
			userInp=int(input("Enter contact: "))
			lst.append(userInp)
			i=i+1
		lst=tuple(lst)
		empDB.update({name:lst})
	elif ch=="3":
		break
		
