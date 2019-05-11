def fib_memo(n, cache):
    if n in cache:
        return cache[n]

    if n < 3:
        result = 1
    else:
        result = fib_memo(n - 1, cache) + fib_memo(n - 2, cache)

    cache[n] = result
    return cache[n]


def fib(n):
    # n번째 피보나치 수를 담는 사전
    fib_cache = {}

    return fib_memo(n, fib_cache)


# 테스트
print(fib(10))
print(fib(50))
print(fib(100))
