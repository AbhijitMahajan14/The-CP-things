empNo=int(input("enter your no"))
empName=input("enter your name")
empSalary=int(input("enter your slary"))
salDeduct=int(input("salary deduction"))
totalAllowance=int(input("enter total allowance"))

salInHand=empSalary-salDeduct+totalAllowance
print("Emp Name is :", empName)
print("In hand Salary :",salInHand)


print("Employee {} has in hand salary {}".format(empName,salInHand))
