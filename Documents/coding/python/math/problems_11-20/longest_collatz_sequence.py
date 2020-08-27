def collatz(n):
    while n != 1:
        if (n % 2) == 0:
            n = n/2
            num_list.append(n)
        else:
            n = (3 * n) + 1
            num_list.append(n)
    return(num_list)

num_list = []
len_lists = []

for n in range(1,1000001):
    collatz(n)
    len_lists.append(len(num_list)

print(num_list)
