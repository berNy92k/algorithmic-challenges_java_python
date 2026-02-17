from euler.problem007 import find_n_prime_number

class TestProblem007:

    def test_find_n_prime_number_for_n_6(self):
        # given
        n = 6

        # when
        result = find_n_prime_number(n)

        # then
        assert result == 13

    def test_find_n_prime_number_for_n_10001(self):
        # given
        n = 10001

        # when
        result = find_n_prime_number(n)

        # then
        assert result == 104743