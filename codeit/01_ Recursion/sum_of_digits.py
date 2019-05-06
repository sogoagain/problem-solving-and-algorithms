# n의 각 자릿수의 합을 리턴
def sum_digits(n):
    # base case
    if n < 10:
        return n

    # recursive case
    n, remainder = divmod(n, 10)
    return remainder + sum_digits(n)


# 테스트
print(sum_digits(22541))
print(sum_digits(92130))
print(sum_digits(12634))
print(sum_digits(704))
print(sum_digits(3755))
