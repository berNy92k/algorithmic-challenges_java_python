def sum_of_all_multiples(max_value, multiple_a, multiple_b):
    sum = 0
    for nb in range(1, max_value):
        if nb % multiple_a == 0 or nb % multiple_b == 0:
            sum += nb

    return sum