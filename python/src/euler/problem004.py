def biggest_palindrome_from_digits(digits):
    number = "9" * digits

    biggestPalindromeFromDigits = 0
    for i in range(1, int(number) + 1):
        for j in range(1 , int(number) + 1):
            result = i * j
            if is_palindrome(result):
                biggestPalindromeFromDigits = max(biggestPalindromeFromDigits, result)

    return biggestPalindromeFromDigits

def is_palindrome(value):
    return str(value) == str(value)[::-1]