T = int(input())
while T>0:
    T -= 1
    a,b,c = map(int,input().split())
    if a+b == c or a*b == c or a/b == c or a-b == c or b/a == c or b-a == c:
        print("Possible")
    else:
        print("Impossible")


