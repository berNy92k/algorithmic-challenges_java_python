# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
# Find the sum of all the multiples of 3 or 5 below 1000.

def sum_of_all_multiples(max_value, multiple_a, multiple_b):
    sum = 0
    for nb in range(1, max_value):
        if nb % multiple_a == 0 or nb % multiple_b == 0:
            sum += nb

    return sum