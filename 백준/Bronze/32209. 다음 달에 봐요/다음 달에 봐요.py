
N  = int(input())
str = "See you next month"
M = 0
while N>0:
    N -= 1
    a,b = map(int,input().split())
    if a==1:
        M+=b
    else:
        M-=b
    if M<0:
        str = "Adios"
        break
print(str)