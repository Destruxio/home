current_trinum = 1

for number in range(1,1000000):
    divisors = []
    current_trinum = (number ** 2 + number) // 2
    for num in range(1, current_trinum + 1):
        if (current_trinum % num) == 0:
            divisors.append(num)
            if len(divisors) == 501:
                print(current_trinum)


