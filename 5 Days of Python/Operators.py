'''
x=int(input("enter x"))
y=int(input("enter y"))
z=int(input("enter z"))
if x>y and x>z:
	print("x is greater")
elif y>x and y>z:
	print("y is greater")
else:
	print("z is greater")'''
	
	
a=input("enter string 1")
b=input("enter string 2")

if len(b)>len(a):
	print("sorry")
elif b in a:
	print("found")
else:
	print("not found")
