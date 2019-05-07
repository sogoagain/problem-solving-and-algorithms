def trapping_rain(buildings):
    rain_block = 0
    for i in range(1, len(buildings) - 1):
        max_left = max(buildings[:i])
        max_right = max(buildings[i + 1:])

        height = max_right
        if max_left < max_right:
            height = max_left

        if height <= buildings[i]:
            continue
        rain_block += height - buildings[i]

    return rain_block


# 테스트
print(trapping_rain([3, 0, 0, 2, 0, 4]))
print(trapping_rain([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))
