
empDb=["Abhijit",7020203767]
i=0
print("=================================----- Employee Maintainance -------=================================")
print('1. Add new employee')
print('2. Update contact details')
print('3. Delete employee details')
print('4. View employee database')
print('5. Exit')
while i==0:
	
	ch=input("Enter your choice")
	
	if ch=="stop":
		break
	else:
		if ch=="1":	
			empName=input("Enter employee name :")
			empDb.append(empName)
			cnt=[]
			k=0
			contAdd=int(input("How many contact you want to add: "))
			while k<contAdd:
				empMob=int(input("Enter Contact Number :"))	
				empDb.append(empMob)
				k=k+1	
			
		
		elif ch=="2":
			empName=input("Enter employee name :")
			if empDb.count(empName)>0:
				empMob=int(input("Enter older contact details :"))
				if empDb.count(empMob)>0:
					ind=empDb.index(empMob)
					newMob=int(input("Enter New Contact Number :"))
					empDb[ind]=newMob
				else:
					print("Please enter valid details")
			else:
				print("Employee is not in Database")
				
		elif ch=="3":
			dl=input("Enter employee name to be deleted")
			cn=2
			if empDb.count(dl)>0:
				ind2=empDb.index(dl)
			
				delMob=empDb[ind2+1]
				del empDb[ind2]
				ind3=empDb.index(delMob)
				del empDb[ind3]
				
				
			else:
				print("Employee is not in Database")
			
		elif ch=="4":
			print(empDb)
		elif ch=="5":
			break
		else:
			print("Enter valid choice")
	
	

		
		
