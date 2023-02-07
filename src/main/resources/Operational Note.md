To add new user to db:

 - Create new user
``` 
CREATE USER 'username'@localhost IDENTIFIED BY 'password'; 
```

 - Grant Access to new user
```
 GRANT ALL PRIVILEGES ON *.* TO 'username'@localhost IDENTIFIED BY 'password';
```

