# family = ['mother', 'father', 'gentleman', 'sexy lady']
# print(len(family))
# family.remove('gentleman')
# print(len(family))
# num = 1
# while num <=10:
#     print(num)
#     num = num + 1
# a = 1
# b = 2
# if a > b:
#     print(111)
# elif a == b:
#     print(222)
# else:
#     print(333)
# max = 10

# while True:
#     num = int(input())
#     if num > max:
#         print(num, 'is too big!')
#         break

N = input()
M = list(map(int,input().split()))
ans = 0
num = 0
for cur in M:
    ans += cur
    num += 1
    if cur == -1:
        num -= 1
        ans += 1
print(ans/num)