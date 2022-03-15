'''
Customer will buy products from FlipKart
 Show all FlipKart Initial Products
 Write a Program to
a. Add to Cart with Price
b. Delete from Cart 
'''


shopDb={"redmi 9":10000,"redmi 10":11000,"realme 8":15000,"Samsung j7":11000}
cartDb=dict()
print(shopDb)
print("Add items in Cart :")
while True:
	ch=input()
	if ch=="stop":
		break
	else:
		if ch in shopDb.keys():
			p=shopDb[ch]
			cartDb.update({ch:p})
print("Your Cart :")
print(cartDb)
cnt=0
for i in cartDb.values():
	cnt=cnt+i
print("You need to Pay :",cnt)
		
