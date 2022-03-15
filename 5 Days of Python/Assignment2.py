f=0
s=1
i=0
lst=[]
while i<10:
	if i<=1:
		next=i
	else:
		next=f+s
		f=s
		s=next
	lst.append(next)
	i=i+1

print(lst)

j=0
total=0
while j<len(lst):
	total=total+lst[j]
	j=j+1

print(total)

inp=int(input("enter any number"))

k=0

while k<len(lst):
	if lst[k]%inp==0:
		print(lst[k],end=" ")
	k=k+1
