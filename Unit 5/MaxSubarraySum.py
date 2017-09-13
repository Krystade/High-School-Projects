numbers = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
max = 0
list = (0)
for i in range(len(numbers)):
    for j in range(len(numbers)):
        if sum(numbers[j:i]) > max:
            max = sum(numbers[j:i])
            list = numbers[j:i]
print(max)
print(list)
