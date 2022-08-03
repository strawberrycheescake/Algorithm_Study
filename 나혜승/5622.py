word = input()

word_arr = [['A','B','C'],['D','E','F'],['G','H','I'],['J','K','L'],['M','N','O'],['P','Q','R','S'],['T','U','V'],['X','Y','W','Z']]
sum = 0
for a in word:
    for i in range(len(word_arr)):
        if(a in word_arr[i]):
            sum = sum + i + 3
print(sum)
