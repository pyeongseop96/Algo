
N,a,b = map(int,input().split())
x = 1
y = 1
while N>0:
    N -= 1
    x += a
    y += b
    if x==y:
        y -= 1
    if x<y:
        tmp = x
        x = y
        y = tmp
print(x,y)