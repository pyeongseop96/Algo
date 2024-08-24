N = input()
M = list(map(int,input().split()))
ans = 0
for num in M:
    if num == 0:
        ans += 2
    elif num == 1:
        ans += 1
    elif num == 2:
        ans += 0.5
    elif num == 4:
        ans += 0.25
    elif num == 8:
        ans += 0.125
    elif num == 16:
        ans += 0.0625
print(ans)