# n = int(input())
# n = 26
# print(n//10) : 2
# print(n % 10) :6
# numbers=(str(n%10)+str((n//10 + n %10)%10))
# print(numbers)
# new_number=int(numbers)
# print(new_number)

cnt = 0
n=int(input())
while True:
    numbers=(str(n%10)+str((n//10 + n %10)%10))
    new_number=int(numbers)
    if n== new_number:
        break    
print(cnt)