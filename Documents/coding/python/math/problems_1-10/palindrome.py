
product = []

for num in range(100,1000):
    for number in range(100,1000):
        product.append(num * number)

palindromes = []

for integer in product:
    if (str(integer) [::-1]) == str(integer):
        palindromes.append(integer)

print(max(palindromes))
