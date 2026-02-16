from euler.problem005 import smallest_value_without_reminder

class TestProblem004:

    def test_smallest_value_min_1_max_10(self):
        # given
        min = 1
        max = 10

        # when
        result = smallest_value_without_reminder(min, max)

        # then
        assert result == 2520

    def test_smallest_value_min_1_max_20(self):
        # given
        min = 1
        max = 20

        # when
        result = smallest_value_without_reminder(min, max)

        # then
        assert result == 232792560