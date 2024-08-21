str = ['she','he','him','her']
ans = 0
N = int(input())
strList = list(input().split())
T = 0
while T < N:
    cur = strList[T]
    if cur in str:
        ans += 1
    T += 1
print(ans)