a,b,c = map(int,input().split())
ans = 0
for i in range(a,b+1):
    cur = i
    while cur != 0:
        if cur % 10 == c:
            ans += 1
        cur //= 10
print(ans)