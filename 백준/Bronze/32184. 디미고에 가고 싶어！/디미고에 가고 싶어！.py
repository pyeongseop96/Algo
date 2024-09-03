a,b = map(int,input().split())
num = b - a + 1
if num % 2 == 1:
    print((num//2) + 1)
else:
    if a%2 == 1:
        print(num//2)
    else:
        print((num//2) + 1)