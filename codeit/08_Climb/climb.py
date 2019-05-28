def select_stops(water_stops, capacity):
    result_stops = [0]
    before_stop = 0
    water = capacity

    for stop in water_stops:
        if water - (stop - result_stops[-1]) < 0:
            result_stops.append(before_stop)
            water = capacity

        before_stop = stop

    if result_stops[-1] != water_stops[-1]:
        result_stops.append(water_stops[-1])
    result_stops.remove(0)

    return result_stops


# 테스트
list1 = [1, 4, 5, 7, 11, 12, 13, 16, 18, 20, 22, 24, 26]
print(select_stops(list1, 4))

list2 = [5, 8, 12, 17, 20, 22, 23, 24, 28, 32, 38, 42, 44, 47]
print(select_stops(list2, 6))
