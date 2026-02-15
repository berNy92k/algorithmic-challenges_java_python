from euler.problem002 import sum_even_fibonacci_v1, sum_even_fibonacci_v2

class TestProblem002:

    def test_sum_of_oven_fibonacci_with_max_value_100_v1(self):
        # given
        max_value = 100

        # when
        result = sum_even_fibonacci_v1(max_value)

        # then
        assert result == 44

    def test_sum_of_oven_fibonacci_with_max_value_4mln_v1(self):
        # given
        max_value = 4000000

        # when
        result = sum_even_fibonacci_v1(max_value)

        # then
        assert result == 4613732

    def test_sum_of_oven_fibonacci_with_max_value_100_v2(self):
        # given
        max_value = 100

        # when
        result = sum_even_fibonacci_v2(max_value)

        # then
        assert result == 44

    def test_sum_of_oven_fibonacci_with_max_value_4mln_v2(self):
        # given
        max_value = 4000000

        # when
        result = sum_even_fibonacci_v2(max_value)

        # then
        assert result == 4613732
