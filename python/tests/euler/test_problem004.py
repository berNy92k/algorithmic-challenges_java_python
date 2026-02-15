from euler.problem004 import biggest_palindrome_from_digits

class TestProblem004:

    def test_biggest_palindrome_from_digits_2(self):
        # given
        digits = 2

        # when
        result = biggest_palindrome_from_digits(digits)

        # then
        assert result == 9009

    def test_biggest_palindrome_from_digits_3(self):
        # given
        digits = 3

        # when
        result = biggest_palindrome_from_digits(digits)

        # then
        assert result == 906609