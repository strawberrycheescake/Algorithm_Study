import math
a,b,c=map(int,input().split())

if a/(c-b)<0:
    print(-1)
else:        
    print(math.ceil(a/(c-b)+1))
