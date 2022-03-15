class papa():
	_b=4
	def __init__(self):
		print("I am papa")
	
class beta(papa):
	
	def __init__(self):
		print("I am beta")
	
p=papa()
print(p._b)
