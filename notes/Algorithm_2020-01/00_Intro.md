# 알고리즘 및 실습

강의 영상: [ALGO 00. 교과목 소개](https://youtu.be/s9tEYZEhWE0)

## 알고리즘이란?

- 문제를 해결하는 절차 (sequence of steps)
- 명확해야 한다.
- 정확해야 한다.
- 유한성(종결성) 특성을 가지고 있다.
- 학습단계
  - 프로그래밍 언어 > 자료구조 > 알고리즘

## 강의 목표

### 컴퓨터공학 관련 SW 개발에서 등장하는 유명한 문제들
- N-Queens, TSP(Traveling Salesman Problem)

### 이 문제들을 해결하는 유명한 알고리즘
- Quicksort, Karatsuba, DFS, BFS, Dijkstra, Bellman-Ford

### 주어진 문제에 대한 알고리즘을 설계하는 방법
- 전수조사 (brute-force, exhaustive search)
  - 가능한 후보를 모두 조사
  - 완전 탐색이라고도 한다.
  - 탐색하는 범위가 제한적일 때 사용
- 분할 정복 (divide-and-conquer)
  - 큰 문제를 작은 여러개의 똑같은 여러개의 문제로 나누어서 해결 > 답들을 모아서 큰 문제의 답을 구함
- 확률적 기법 (probabilistic algorithm)
  - 여러 기법들에서 사용 할 수 있는 기법
  - 알고리즘 내에 확률적 요소가 들어감
- 탐욕적 기법 (greedy algorithm)
  - 여러 후보들을 찾아갈 때 가장 근접한 후보들을 위주로 찾아가는 방법
- 동적 프로그래밍 (dynamic programming)
  - 전수 조사를 할 때 조금 더 효과적으로 할 수 있도록 해주는 기법
- 되추적 (backtracking)
  - 전수 조사를 조금 더 효과적으로
- 분기한정 (branch-and-bound)
  - 전수 조사를 조금 더 효과적으로

### 알고리즘의 정확성을 증명하는 방법 학습
- 알고리즘의 성능 (시간복잡도, 공간복잡도)을 분석하는 방법
  - 빅O
    - 점근적인 접근 방법 (대략적인 분석)

### 효과적인 알고리즘이 발견되지 않는 문제 이해
- P와 NP 이야기
  - 컴퓨터공학에 대한 자부심

## 개인 목표

### 상위 레벨

- 제시된 이론 완벽 이해: 수학적 내용 이해 및 응용 가능
  - 알고리즘 정확성 증명 가능
  - 알고리즘에 대한 수학적 분석 가능
- 알고리즘 개발 및 응용 가능

### 목표 레벨

- 제시된 이론에 대한 개념 이해
- 대부분의 알고리즘 개발 가능
  - 개발 못한 것도 제시된 해결책을 보면 이해됨

### 일반 레벨

- 제시된 이론 부분적 이해
- 제시된 알고리즘 일부 또는 부분적 개발
  - 일부 응용 가능
  - 제시된 해결책 코드를 보아도 이해 못하는 경우가 있다.
- 발전 가능성이 충분히 있는 경우

## 참고자료

### 교재

- Algorithms Illuminated Part1/2/3
- FOUNDATIONS OF ALGORITHMS
- 프로그래밍 대회에서 배우는 알고리즘 문제해결 전략 1/2

### 강의

- MOOC
  - [Coursera, Standford,](https://www.coursera.org/specializations/algorithms)