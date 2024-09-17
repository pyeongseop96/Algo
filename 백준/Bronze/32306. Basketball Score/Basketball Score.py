a,b,c = map(int,input().split())
d,e,f = map(int,input().split())
aa = a + (2*b) + (3*c)
bb = d + (2*e) + (3*f)
if aa>bb:
    print(1)
elif aa<bb:
    print(2)
else:
    print(0)