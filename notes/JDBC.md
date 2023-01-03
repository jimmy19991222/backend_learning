## Transaction

Both succeed or both fail.

### ACID

ACID stands for **Atomicity, Consistency, Isolation and Durability**

* Atomicity: either all successful or none,
* Consistency:  ensures bringing the database from one consistent state to another consistent state,
* Isolation: ensures that transaction is isolated from other transaction,
* Durability: once a transaction has been committed, it will remain so, even in the event of errors, power loss etc.

In conclusion, ACID ensures data's security.

```Java
Init transaction;
Commit transaction commit();
Rollback transaction rollback();
Close transaction;

Transfer of account:
A: 1000
B: 1000

A(900) ---100---> B(1100)
```

