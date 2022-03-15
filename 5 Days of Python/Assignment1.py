
list1=[]
list2=[]
list3=[]

i=0
print("=>Note: write stop to stop adding elements in list. ")
print("Enter element in List 1: ")
while i==0:
	userInp=input()
	if userInp=="stop":
		break
	else:
		list1.append(userInp)
	
i=0
print("Enter element in List 2: ")
while i==0:
	userInp=input()
	if userInp=="stop":
		break
	else:
		list2.append(userInp)

j=0
while j<len(list1):
	if len(list1[j])<4:
		list3.append(list1[j])
	j=j+1
	
k=0
while k<len(list2):
	if len(list2[k])<4:
		list3.append(list2[k])
	k=k+1
	
print("Elements in List 3: ")
x=0
while x<len(list3):
	print(list3[x],end=" ")
	x=x+1
