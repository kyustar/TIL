# 175. Combine Two Tables

Date: June 29, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/combine-two-tables/
핵심: join

```sql
select p.FirstName, p.LastName, a.City, a.State 
from Person as p left join Address as a 
on p.PersonId = a.PersonId;
```

사람 정보를 가진 Person table과 주소 정보를 가진 Address table을 이용하여 join을 하는 문제이다.

Person의 정보를 기준으로 이름을 출력하고 그에 따른 주소를 출력하는 문제이기 때문에 left join을 사용하는 것이 좋다.

—> SQL을 요즘 너무 하지 않아서, 문법도 정확히 기억이 나지 않았다. 매일 한 두 문제씩 풀면서 다시 문법을 체화시켜야겠다.