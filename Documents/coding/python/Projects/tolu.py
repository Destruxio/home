
def arrowHead():
    bot_row = input("Input a number for the bottom row that is odd and between 3 and 61: ")
    ast = "*"
    if bot_row.isnumeric():
        if (int(bot_row) % 2) == 1:
            iteration = 1
            change = 1

            #Arrow Head
            while iteration <= (int(bot_row)):
                space = " " * (int(bot_row) - change)
                print(space + ast)
                ast = ("**" + ast)
                change = change + 1
                iteration = iteration + 2

            #Arrow Tail
            space = " " * (int(bot_row) - 1)
            print(space + "*")
            space = " " * (int(bot_row) - 1)
            print(space + "*")
            space = " " * (int(bot_row) - 1)
            print(space + "*")

        else:
            print("Please enter an odd number.")
            arrowHead()
    else:
        print("Please enter a numeric value")
        arrowHead()

arrowHead()
