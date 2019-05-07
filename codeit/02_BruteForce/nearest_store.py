from math import sqrt


def distance(store1, store2):
    return sqrt((store1[0] - store2[0]) ** 2 + (store1[1] - store2[1]) ** 2)


def closest_pair(coordinates):
    closest_store = coordinates[0], coordinates[1]
    for i, store1 in enumerate(coordinates):
        for j in range(i + 1, len(coordinates)):
            if distance(coordinates[i], coordinates[j]) < distance(closest_store[0], closest_store[1]):
                closest_store = coordinates[i], coordinates[j]

    return closest_store


# 테스트
test_coordinates = [(2, 3), (12, 30), (40, 50), (5, 1), (12, 10), (3, 4)]
print(closest_pair(test_coordinates))
