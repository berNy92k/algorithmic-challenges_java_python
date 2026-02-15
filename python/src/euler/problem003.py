def biggest_prime_factor_of_the_number(value):
    if value < 2:
        return value

    biggest_number = 0

    i = 2
    while i * i < value:
        if value % i == 0:
            counter = 0
            j = 2
            while j * j < i:
                if i % j == 0:
                    counter += 1

                j += 1
            if counter == 0:
                biggest_number = i

        i += 1

    return biggest_number