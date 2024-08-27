N = int(input())
a = 0
while N%2==0:
    a += 1
    N //= 2
print(N, a)