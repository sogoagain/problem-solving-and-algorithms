def fib_optimized(n):
    before_value = [0, 1]

    for i in range(2, n + 1):
        before_value[1], before_value[0] = before_value[0] + before_value[1], before_value[1]

    return before_value[1]


# 테스트
print(fib_optimized(16))
print(fib_optimized(53))
print(fib_optimized(213))
