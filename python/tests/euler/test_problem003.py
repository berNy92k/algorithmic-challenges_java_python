from euler.problem003 import biggest_prime_factor_of_the_number

class TestProblem003:

    def test_biggest_prime_factor_of_the_number_13195(self):
        # given
        max_value = 13195

        # when
        result = biggest_prime_factor_of_the_number(max_value)

        # then
        assert result == 29

    def test_biggest_prime_factor_of_the_number_600851475143(self):
        # given
        max_value = 600851475143

        # when
        result = biggest_prime_factor_of_the_number(max_value)

        # then
        assert result == 6857