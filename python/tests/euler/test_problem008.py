from euler.problem008 import find_n_adjacent_digits_with_biggest_result

class TestProblem008:

    def test_find_n_adjacent_digits_with_biggest_result_for_n_4(self):
        # given
        n = 4

        # when
        result = find_n_adjacent_digits_with_biggest_result(n)

        # then
        assert result == 5832

    def test_find_n_adjacent_digits_with_biggest_result_for_n_13(self):
        # given
        n = 13

        # when
        result = find_n_adjacent_digits_with_biggest_result(n)

        # then
        assert result == 23514624000