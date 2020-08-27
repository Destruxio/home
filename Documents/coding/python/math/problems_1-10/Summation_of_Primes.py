primes = [2,3,5,7,11,13]
current_number = 13

while len(primes) <= 2000000:
    current_number += 1
    for divisor in range(2,current_number + 1):
        if (current_number % divisor == 0) and (current_number == divisor):
            primes.append(current_number)
            break
        elif (current_number % divisor == 0) and (current_number != divisor):
            break
        else:
            continue


print(sum(primes))
