#from calMod import addi,mul,sub,div
import calMod
a=int(input("Enter num 1 :"))
b=int(input("Enter num 2 :"))
c=input("Enter Operator :")
if c=="+":
	calMod.addi(a,b,c)
elif c=="-":
	calMod.sub(a,b,c)
elif c=="*":
	calMod.mul(a,b,c)
elif c=="/":
	calMod.div(a,b,c)
