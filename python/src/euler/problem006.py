def squares_of_sum_calculate(n: int) -> int:
    sum = 0
    for i in range(1, n + 1):
        sum +=i

    return sum ** 2

def squares_calculate(n: int) -> int:
    squares_sum = 0
    for i in range(1, n + 1):
        squares_sum += i ** 2

    return squares_sum

def difference_between_sum_of_squares_and_square_of_sum(n: int) -> int:
    squaresSum = squares_calculate(n)
    squareOfSum = squares_of_sum_calculate(n)

    return squareOfSum - squaresSum