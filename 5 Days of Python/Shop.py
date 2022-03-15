
loginDict=dict({'Abhijit':'abhijit@101'})
def	loginAct():
	print("-"*40,"    LOGIN    ","-"*40)
	userName=input("Enter Employee Name :")
	userPwd=input("Enter password :")
	if userName not in loginDict.keys() and userPwd not in loginDict.values():
		print("Please enter valid details!")
	elif loginDict[userName]==userPwd:
		print("\nLogin Successfully !\n")	

loginAct()

products=[{"prodName":"Charger","prodId":"C101","descr":"charge very fast","price":200},{"prodName":"Dell Latitude","prodId":"D101","descr":"RAM :8Gb","price":200000},{"prodName":"HeadPhones BOAT","prodId":"H101","descr":"Good built quality","price":1200},{"prodName":"Wireless Mouse","prodId":"W101","descr":"Good Frequancy","price":2000}]
for i in products:
	print(i)
	
bill=[]
urCart=[]
def checkDict(e:dict,n):
	if e["prodName"]==n:
			print(n," :",e["price"])
			bill.append(e["price"])
			d=dict()
			d={n:e["price"]}
			urCart.append(d)
			
	
def addProd():
	n=input("Enter product name :")
	for i in products:
		checkDict(i,n)
	
	
	
def viewCart():
	print("Cart Items :")
	for i in urCart:
		print(i)
f=0
def genBill():
	c=0
	for i in bill:
		c=c+i
		f=c
	print("you need to pay :",f)
	
def delPro(n):
	f=f-n
	

print("-"*40,"    Menu    ","-"*40)
print("1.Add product in cart \n2.Delete product from cart \n3.Generate bill\n5.View Cart\n6.Exit")
while True:
	ch=input("Enter your choice :")
	if ch=="1":
		addProd()
	elif ch=="5":
		viewCart()
	elif ch=="3":
			genBill()
	elif ch=="2":
		n=int(input("Enter product to delete :"))
		delPro(n)
	elif ch=="6":
		break
