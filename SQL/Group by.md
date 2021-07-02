# Group by

Date: July 2, 2021
Tags: 프로그래머스
문제링크: https://programmers.co.kr/learn/courses/30/lessons/59412
핵심: Group by

SQL 문제를 풀 때면  Group by가 헷깔릴때가 많다. 

중복을 없앨때에도 사용되고, 가장 많이 사용되는 부분은 그룹별 ~~~ 을 구하기 위해서 사용한다.

### 주의!

group by [그룹화할 컬럼] having [조건]

where과 헷깔리면 안된다. where은 그룹화 하기 전의 조건이고, having은 그룹화에 대한 조건이다!

### 순서

1. where 조건
2. where 조건에 대한 group by 그룹화
3. where 조건에 대한 group by 그룹화에 대한 조건

예시 문제

[https://programmers.co.kr/learn/courses/30/lessons/59412](https://programmers.co.kr/learn/courses/30/lessons/59412)

```sql
select hour(datetime), count(*) from animal_outs 
where hour(datetime) >= 9 and hour(datetime) < 20
group by hour(datetime) order by hour(datetime)
```