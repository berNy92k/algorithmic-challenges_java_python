def sum_even_fibonacci_v1(max_value):
    sum = 0

    previous_value = 1
    current_value = 2
    while current_value < max_value:
        if current_value % 2 == 0:
            sum += current_value

        temp_value = current_value
        current_value = previous_value + current_value
        previous_value = temp_value

    return sum

def sum_even_fibonacci_v2(max_value):
    sum = 0

    previous_value = 1
    current_value = 2
    while current_value < max_value:
        if current_value % 2 == 0:
            sum += current_value

        current_value, previous_value = previous_value + current_value, current_value

    return sum