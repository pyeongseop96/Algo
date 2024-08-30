N = int(input())
if N%2==1:
    while N>0:
        N -= 1
        tmp = input()
    print("still running")

else:
    ans = 0
    while N>0:
        N -= 2
        a = int(input())
        b = int(input())
        ans += b-a
    print(ans)