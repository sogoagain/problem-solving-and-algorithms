def max_profit(price_list, count):
    profit_table = [price_list[0], price_list[1]]

    for i in range(2, count + 1):
        profit = 0
        for j in range(1, i // 2 + 1):
            profit = max(profit, profit_table[j] + profit_table[i - j])

        if i < len(price_list):
            profit = max(profit, price_list[i])
        profit_table.append(profit)

    return profit_table[count]


# 테스트
print(max_profit([0, 200, 600, 900, 1200, 2000], 5))
print(max_profit([0, 300, 600, 700, 1100, 1400], 8))
print(max_profit([0, 100, 200, 400, 600, 900, 1200, 1300, 1500, 1800], 9))
