# Word values

ones = [ "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]

tens = [ "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"]

hundreds = [ "", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"]

thousand = "onethousand"

num_lens = []

# Ones
for i in range(1,20):
    current_num = ones[i]
    num_lens.append(len(current_num))

# Tens
for num in range(21,100):
    num_list = list(str(num))
    current_num = tens[int(num_list[0])] + ones[int(num_list[1])]
    num_lens.append(len(current_num))

#Hundreds
for number in range(100,1000):
    num_list = list(str(number)
        if num_list[2] == 0:
        if num_list[1] == 0:
            current_num = hundreds[num_list[0]]
        elif num_list[1]:
            current_num = hundreds[num_list[0]] + "and" + tens[num_list[1]]
