def course_selection(course_list):
    selected_courses = []

    course_list.sort(key=lambda course: course[1])
    selected_courses.append(course_list[0])

    for course in course_list:
        last_course = selected_courses[-1]
        if last_course[1] <= course[0]:
            selected_courses.append(course)
            continue

    return selected_courses


# 테스트
print(course_selection([(6, 10), (2, 3), (4, 5), (1, 7), (6, 8), (9, 10)]))
print(course_selection([(1, 2), (3, 4), (0, 6), (5, 7), (8, 9), (5, 9)]))
print(course_selection([(4, 7), (2, 5), (1, 3), (8, 10), (5, 9), (2, 5), (13, 16), (9, 11), (1, 8)]))
