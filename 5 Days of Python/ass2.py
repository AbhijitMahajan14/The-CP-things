empDb=dict()
i=0
print("=============>Employee Database<============")
print("1.Count of Employees\n2.Add New Employee\n3.Modify Existing Employee\n4.Delete Existing Employee\n5.Exit")
def addEmp(name,deptno,deptname,salary):
	empDb.update({"Name":name,"Department":deptname,"Dept No":deptno,"Salary":salary})

while i==0:
    ch=input("Enter you choice :")
    if ch=="2":
		empName=input("Enter Employee Name :")
		deptName=input("Enter Department Name :")
		deptNo=input("Enter Department Number :")
		sal=int(input("Enter your Salary :"))
		addEmp(empName,deptName,deptNo,sal)
	elif ch=="5":
		break
print(empDb)
		
    
