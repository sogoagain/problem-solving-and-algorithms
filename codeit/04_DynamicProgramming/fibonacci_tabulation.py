def fib_tab(n):
    fibonacci_list = []

    for i in range(n + 1):
        if i < 3:
            fibonacci_list.append(1)
            continue

        fibonacci_list.append(fibonacci_list[i - 1] + fibonacci_list[i - 2])

    return fibonacci_list[len(fibonacci_list) - 1]


# 테스트
print(fib_tab(10))
print(fib_tab(56))
print(fib_tab(132))
