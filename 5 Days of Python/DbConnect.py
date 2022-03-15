>>> import sqlite3
>>> conn=sqlite3.connect('firstDb.db')
>>> conn.execute('''CREATE TABLE EMP(ID INT PRIMARY KEY,NAME TEXT NOT NULL,AGE INT NOT NULL,ADDRESS CHAR(50),SALARY REAL);''')
<sqlite3.Cursor object at 0x00000256CB689B20>

>>> conn.execute('''insert into EMP values(1,"abhijit",12,"jamner",200)''')
<sqlite3.Cursor object at 0x00000256CB6899D0>
>>> conn.commit()
>>> mycur=conn.cursor()
>>> mycur.execute('select * from EMP')
<sqlite3.Cursor object at 0x00000256CB689B20>
>>> for i in mycur:
...     print(i)
...
(1, 'abhijit', 12, 'jamner', 200.0)
