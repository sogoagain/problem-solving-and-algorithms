def merge(list1, list2):
    result_list = []

    list1_index = 0
    list2_index = 0
    while list1_index < len(list1) and list2_index < len(list2):
        list1_value = list1[list1_index]
        list2_value = list2[list2_index]
        if list1_value < list2_value:
            result_list.append(list1_value)
            list1_index += 1
            continue

        result_list.append(list2_value)
        list2_index += 1

    if list1_index != len(list1):
        result_list += list1[list1_index:]

    if list2_index != len(list2):
        result_list += list2[list2_index:]

    return result_list


# 합병 정렬
def merge_sort(my_list):
    # base case
    if len(my_list) < 2:
        return my_list

    # divide
    mid_index = len(my_list) // 2

    # conquer
    left = merge_sort(my_list[:mid_index])
    right = merge_sort(my_list[mid_index:])

    # conquer
    return merge(left, right)


# 테스트
print(merge_sort([1, 3, 5, 7, 9, 11, 13, 11]))
print(merge_sort([28, 13, 9, 30, 1, 48, 5, 7, 15]))
print(merge_sort([2, 5, 6, 7, 1, 2, 4, 7, 10, 11, 4, 15, 13, 1, 6, 4]))

# 테스트
print(merge([1],[]))
print(merge([],[1]))
print(merge([2],[1]))
print(merge([1, 2, 3, 4],[5, 6, 7, 8]))
print(merge([5, 6, 7, 8],[1, 2, 3, 4]))
print(merge([4, 7, 8, 9],[1, 3, 6, 10]))
