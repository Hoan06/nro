# Huong dan chay local

## 1. Kiem tra database

- MySQL dang chay o `localhost:3306`.
- Database ten `server`.
- User `root`.
- Password `13032006`.
- Neu chua import schema, import file `NgocRongOnline-Server/server.sql` vao database `server`.

## 2. Chay server

Mo file:

`NgocRongOnline-Server/run.bat`

Khi server chay dung, console se co cac dong gan cuoi:

```text
Connect Success!
Start server...
```

Server game dang listen o port `14445`.

Neu sua source Java sau nay, chay truoc:

`NgocRongOnline-Server/build-local.bat`

roi chay lai `run.bat`.

## 3. Chay client

Thu mo client build san:

`Client/Dragonboy_vn_v230/Dragonboy_vn_v230.exe`

Neu client build san khong hien server `Local` hoac khong ket noi `127.0.0.1:14445`, hay build lai Unity project:

1. Cai Unity `2021.3.16f1`.
2. Open project `Client/Source_Unity`.
3. Build Windows client.
4. Chay file exe moi build.

Source client da duoc sua de server dau tien la:

```text
Local:127.0.0.1:14445
```
