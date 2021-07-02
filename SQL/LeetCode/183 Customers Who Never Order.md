# 183. Customers Who Never Order

Date: July 2, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/customers-who-never-order/
핵심: join, not in

회원 테이블과 주문테이블이 있는데, 회원중에서 주문을 하지 않은 사람의 이름을 찾는것이다.

[Customer.id](http://customer.id) = Order.CustomerId 조건으로 join 해주는 형태로 테이블을 합친 후, CustomerId 가 null인 것을 출력해주었다.

```sql
select c.Name as Customers from Customers as c left join Orders as o
on c.Id = o.CustomerId where o.CustomerId is null
```

속도 : 384 ms, faster than 92.18% of MySQL online submissions

같은 코드를 돌려도 속도차이가 크게 날 때가 있어서, 너무 속도를 맹신하면 안되겠다는 생각을 했다.

다른 풀이 Customer 테이블의 id와 

where절에 서브쿼리에서 not in을 이용하여 Order 테이블의 CustomerId를 비교

( **in :** where절에서 여러 조건이 일치하는지 확인하는데 주로 사용)

```sql
select c.Name as Customers from Customers as c
where c.Id not in (select CustomerId from Orders)
```

속도 : 370ms ~ 450까지 다양하게 분포...