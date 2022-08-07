game= list(input())
# print(game)
total = 0
score = 0
for a in game:
    if a =='o':
        total += 1
        score += total
    elif a =='x':
        total = 0

print(score)

# 'o x o o'
#  1   2 3 = 6.....왜 7....?
#  1 0 1 2