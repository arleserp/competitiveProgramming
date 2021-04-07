from itertools import permutations as itertools_permutations

c = list(map(int,input().split(" ")))
n = len(c)
lists = list(itertools_permutations(list(range(1,n+1))))
for li in lists:
    print(li)


