'''try:
	x=10/0
except ZeroDivisionError :
	print("zero")
'''

class mxExc(Exception):
	pass
	
	
class mnExc(Exception):
	pass
	
try:
	n1=int(input("entet n1 :"))
	n2=int(input("entet n2 :"))
	
	if n1>n2:
		raise mxExc
	else:
		raise mnExc
	
except mxExc:
	print("max")
	
except mnExc:
	print("min")
	
else:
	print("I  will execute when there is no error in try block")

finally:
	print("i will always exc")
