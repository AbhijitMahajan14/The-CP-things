class myEmp():
	def __init__(self,empId,empName,basicSal,da,hra,tds):
		self.empId=empId
		self.empName=empName
		self.basicSal=basicSal
		self.da=da
		self.hra=hra
		self.tds=tds
	def calSal(self):
		print("Your In hand Salary :",self.basicSal-self.hra-self.tds+self.da)

m=myEmp(1,"a",12,1,2,4)
m.calSal()




class f1():
	def __init
