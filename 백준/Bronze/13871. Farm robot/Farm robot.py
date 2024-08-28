N,C,S = map(int,input().split())
cur = 0
ans = 0
if S == 1:
    ans += 1
numList = list(map(int,input().split()))
for num in numList:
    cur = (cur + N + num) % N
    if S - 1 == cur:
        ans += 1
print(ans)