
empDB=["Abhijit",7020203767,"Sumit",9876452343,"Harshal",9034762211]
print("Existing Database:",empDB)
empName=input("enter employee name")

if empDB.count(empName)>0:
	i=empDB.index(empName)
	print("Contact Number: ",empDB[i+1])
else:
	empPhone=int(input("enter phone number"))
	empDB.append(empName)
	empDB.append(empPhone)
	
print(empDB)
