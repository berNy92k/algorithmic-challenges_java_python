from euler.problem006 import difference_between_sum_of_squares_and_square_of_sum

class TestProblem006:

    def test_difference_between_sum_of_squares_and_square_of_sum_for_n_10(self):
        # given
        n = 10

        # when
        result = difference_between_sum_of_squares_and_square_of_sum(n)

        # then
        assert result == 2640

    def test_difference_between_sum_of_squares_and_square_of_sum_for_n_100(self):
        # given
        n = 100

        # when
        result = difference_between_sum_of_squares_and_square_of_sum(n)

        # then
        assert result == 25164150
