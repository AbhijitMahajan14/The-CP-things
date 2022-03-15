sp= "=!#$%^&*()-+?_=,<>/"
def test(email):
	a=str2.count("@")

	if str2.find("@") and (str2.find("gmail.com")or str2.find(".edu")or str2.find(".gov")) and (any(c in sp for c in str2)==0):
		print("valid")
	else:
		print("invalid")
str2=input("please enter your email")
test(str2)
