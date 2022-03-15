empDb=["Abhijit",7020203767]
i=0
print("----- Select choice -------")
print('1. Add new employee')
print('2. Update contact details')
print('3. Delete employee details')
print('4. View employee database')
while i==0:
	
	ch=input("Enter your choice")
	
	if ch=="stop":
		break
	else:
		if ch=="1":	
			empName=input("Enter employee name :")
			empMob=int(input("Enter Contact Number :"))
			empDb.append(empName)
			empDb.append(empMob)
			
		
		elif ch=="2":
			empName=input("Enter employee name :")
			empMob=int(input("Enter older contact details :"))
			if empDb.count(empMob)>0 and empDb.count(empName)>0:
				ind=empDb.index(empMob)
				newMob=int(input("Enter New Contact Number :"))
				empDb[ind]=newMob
				
		elif ch=="3":
			dl=input("Enter employee name to be deleted")
			ind2=empDb.index(dl)
			delMob=empDb[ind2+1]
			del empDb[ind2]
			ind3=empDb.index(delMob)
			del empDb[ind3]
			
		elif ch=="4":
			print(empDb)
	
	

		
		
