def consecutive_sum(start, end):
    # base case
    if start == end:
        return start

    # divide
    mid = (start + end) // 2

    # conquer
    sum_left = consecutive_sum(start, mid)
    sum_right = consecutive_sum(mid + 1, end)

    # combine
    return sum_left + sum_right


# 테스트
print(consecutive_sum(1, 10))
print(consecutive_sum(1, 100))
print(consecutive_sum(1, 253))
print(consecutive_sum(1, 388))
