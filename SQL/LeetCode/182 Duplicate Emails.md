# 182. Duplicate Emails

Date: July 2, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/duplicate-emails/
핵심: group by having, count

2번 이상 중복되는 이메일을 출력하는 문제였다.

처음 group by having를 이용하여 count가 2이상인 것을 따로 추출했다.

```sql
select Email from Person group by Email having count(Email) >= 2;
```

속도 : 309 ms, faster than 60% of MySQL online submissions

solution의 다른 답도 보니 딱히 신선한 것은 없었다.

두번째는 셀프조인을 활용하여 문제를 푼 방법이다.

```sql
select distinct p1.Email
from Person as p1 join Person as p2
where p1.Email = p2.Email and p1.id != p2.id
```

속도 : 309 ms, faster than 56.82% of MySQL online submissions

두개의 속도의 차이는 거의 없었다. 첫번째 푼것이 더 보기 좋고 깔끔한 느낌이라 좋다.