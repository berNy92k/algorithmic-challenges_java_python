def find_n_prime_number(n: int) -> int:
    prime_number = 1
    counter_of_prime_numbers = 0

    current_nb = 1
    while counter_of_prime_numbers < n:
        current_nb += 1

        counter = 0
        for i in range(2, current_nb + 1):
            if current_nb % i == 0:
                counter += 1

        if counter == 1:
            counter_of_prime_numbers += 1
            prime_number = current_nb

    return prime_number