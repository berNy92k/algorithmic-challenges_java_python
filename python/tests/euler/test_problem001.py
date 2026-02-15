from euler.problem001 import sum_of_all_multiples

class TestProblem001:

    def test_sum_of_all_multiples_returns_23_for_3_or_5_below_10(self):
        # given
        max_value = 10
        multiple_a = 3
        multiple_b = 5

        # when
        result = sum_of_all_multiples(max_value, multiple_a, multiple_b)

        # then
        assert result == 23

    def test_sum_of_all_multiples_returns_233168_for_3_or_5_below_1000(self):
        # given
        max_value = 1000
        multiple_a = 3
        multiple_b = 5

        # when
        result = sum_of_all_multiples(max_value, multiple_a, multiple_b)

        # then
        assert result == 233168
