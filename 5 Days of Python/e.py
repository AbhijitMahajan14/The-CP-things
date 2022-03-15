import re
f=open("name.txt","r")
name=input("Enter name :")
l=f.readlines()
c=0
for i in l:
	d=str(i)
	if re.match("name",d):
		c+=1
print(c)
