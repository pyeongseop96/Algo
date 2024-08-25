a,b = map(int,input().split())
cur = 0
ans = 0
while True:
    if a+cur<=b:
        cur += a
        ans += 1
    else:
        break
    a *= 2
print(ans)