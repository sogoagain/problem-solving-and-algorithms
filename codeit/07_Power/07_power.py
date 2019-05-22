def power(x, y):
    # base case
    if y == 1:
        return x

    half_power = power(x, y // 2)
    # recursive case
    if y % 2 == 1:
        return x * half_power * half_power

    return half_power * half_power


# 테스트
print(power(3, 5))
print(power(5, 6))
print(power(7, 9))
