class A():
	def __init__(self):
		print("hey bro A")
	def ShowA(self):
		print("A")

class B(A):
	def __init__(self):
		print("hey bro B")
	def ShowB(self):
		print("B")
		
class C(B):
	def __init__(self):
		print("hey bro C")
	def ShowC(self):
		print("C")
		
		
c=C()
c.ShowA()
