lst=[]
i=0
while i==0:
	userInp=input()
	if userInp=="stop":
		break
	else:
		lst.append(userInp)
		
l=len(lst)
i=0
new1=[]
new2=[]
while i<l:
	print(lst[i],":",lst.count(lst[i]))
	
	if lst.count(lst[i])>2:
		new1.append(lst[i])
		new1.append(lst.count(lst[i]))
	else:
		new2.append(lst[i])
		new2.append(lst.count(lst[i]))
	
	i+=1
	
print(new1)	
print(new2)	
