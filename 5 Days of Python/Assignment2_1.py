
login=()
lst=[]
lst3=[]
lst4=[]
loginDict=dict({'Abhijit':'abhijit@101'})
def update(d:dict,empName):
	if empName in d.values():
		newSal=input("Enter new salary :")
		d["empSal"]=newSal
	if empName not in d.values():
		print("Invalid input")
	
def delete(d:dict,empName):
	if empName in d.values():
		a=lst.index(d)
		del lst[a]

def countDict(d:dict,deptno):
	t=d['empDeptId']
	if t==deptno:
		x=d['empName']
		lst3.append(x)
		y=d['empName']
		z=d['empSal']
		di={y:z}
		lst4.append(di)
		
	
def showDetails(d:dict):
	
	print("EmpId :",d["empId"])
	print("Employee Name :",d["empName"])	
	print("Employee Department Id :",d["empDeptId"])	
	print("Employee Department Name :",d["empDeptName"])	
	print("Employee Salary :",d["empSal"])	
	print("\n")
	
def	loginAct():
	print("-"*40,"    LOGIN    ","-"*40)
	userName=input("Enter Employee Name :")
	userPwd=input("Enter password :")
	if userName not in loginDict.keys() and userPwd not in loginDict.values():
		print("Please enter valid details!")
	elif loginDict[userName]==userPwd:
		print("\nLogin Successfully !\n")
	
	
		

loginAct()


	
while True:
	
	print(40 * "-" , "EMPLOYEE MAINTENANCE" , 40 * "-")
	print("1.Add New Employee\n2.Modify Employee Salary\n3.Delete Employee Details\n4.Count Employees in Department\n5.View Databaset\n6.Logout\7.Exit")
	print(40 * "-" , "EMPLOYEE MAINTENANCE" , 40 * "-")
	ch=input("\nPlease Enter Your Choice :")
	

	if ch=="1":
		empId=input("Enter EmpId :")
		empName=input("Enter Employee Name :")
		empDeptId=input("Enter Employee Dept Id :")
		empDeptName=input("Enter Employee Dept Name :")
		empLoginPwd=input("Set your password :")
		empSal=int(input("Enter Employee Salary :"))
		
		temp={"empId":empId,"empName":empName,"empDeptId":empDeptId,"empDeptName":empDeptName,"empLoginPwd":empLoginPwd,"empSal":empSal}
		#empDetails.update({"empId":empId,"empName":empName,"empDeptId":empDeptId,"empLoginPwd":empLoginPwd,"empSal":empSal})
		
		lst.append(temp)
		#empDeptDb.update({empDeptId:temp})
		loginDict.update({empName:empLoginPwd})
		
		
	
	elif ch=="2":
		userEmp=input("Enter Employee Name that you want to modify :")
		userDeptNo=input("Enter Employee Dept Number :")
		for i in lst:
			update(i,userEmp)
		
		'''ext=empDeptDb[userDeptNo]
		print(ext)
		if userEmp in ext.values():
			newSal=input("Enter new salary :")
			ext2=ext[userEmp]
			ext2['empSal']=newSal
		else:
			print("Please enter valid employee name!")'''
			
	elif ch=="3":
		userEmpdl=input("Enter Employee Name that you want to Delete :")
		for i in lst:
			delete(i,userEmpdl)
		
		
	elif ch=="4":
		userDeptNo=input("Enter Employee Dept Number :")
		for i in lst:
			countDict(i,userDeptNo)
		print("Deptno    ->",userDeptNo )
		print("Employees ->",lst3)
		print("Salaries  ->",lst4)
	elif ch=="5":
		print("-"*102)
		for i in lst:
			showDetails(i)
		print("-"*102)
	elif ch=="6":
		loginAct()
	elif ch=="7":
		 break
	else:
		print("Invalid choice !")
