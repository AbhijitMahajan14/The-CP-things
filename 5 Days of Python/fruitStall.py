print("==============------Fruit Stall-------=============")
print("\n1.Add fruits in Fruits Stall 1: \n2.Add fruits in Fruits Stall 2 \n3.Common fruits in both Fruit Stalls \n4.Extra Fruits in Fruit Stall 1 \n5.Extra Fruits in Fruit Stall 2 \n6.Total Fruits in both Fruit Stall \n7.Exit")

i=0
f1=set()
f2=set()
while i==0:
	ch=input("Please Select: ")
	if ch=="1":
		j=0
		print("Add fruits in Fruits Stall 1:")
		while j==0:
			fr=input()
			if fr=="stop":
				break
			else:
				f1.add(fr)
	elif ch=="2":
		k=0
		print("Add fruits in Fruits Stall 2:")
		while k==0:
			fr=input()
			if fr=="stop":
				break
			else:
				f2.add(fr)
	elif ch=="3":
		print("Common fruits in both Fruits Stalls :",f1&f2)
	elif ch=="4":
		print("Extra fruits in Fruits Stalls 1:",f1-f2)
	elif ch=="5":
		print("Extra fruits in Fruits Stalls 2:",f2-f1)
	elif ch=="6":
		print("Total fruits in both Fruits Stalls :",f1|f2)
		
	elif ch=="7":
		break
	else:
		print("Invalid choice")
		
			
		
			
				
	
