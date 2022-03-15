
l1=list()
l2=list()

i=0
print("Enter elements in List 1 :")
while True:
    ch=input()
    if ch=="stop":
        break
    else:
        l1.append(ch)

print("Enter elements in List 2 :")
while True:
    ch=input()
    if ch=="stop":
        break
    else:
        l2.append(ch)
l3=list()
i=0
while i<len(l1):
    if i%2!=0:
        l3.append(l1[i])
    i=i+1      
     
j=0
while j<len(l2):
    if j%2==0:
        l3.append(l2[j])
    j=j+1
        
print(l3)
