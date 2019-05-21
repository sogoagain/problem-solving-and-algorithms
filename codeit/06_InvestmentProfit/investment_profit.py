def sublist_max(profits):
    max_profits = []
    for i in range(len(profits)):
        max_profit = profits[i]
        for j in range(i + 1, len(profits)):
            if max_profit < max_profit + profits[j]:
                max_profit += profits[j]

        max_profits.append(max_profit)

    max_profits.sort(reverse=True)
    return max_profits[0]


# 테스트
print(sublist_max([4, 3, 8, -2, -5, -3, -5, -3]))
print(sublist_max([2, 3, 1, -1, -2, 5, -1, -1]))
print(sublist_max([7, -3, 14, -8, -5, 6, 8, -5, -4, 10, -1, 8]))
