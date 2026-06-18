@ECHO OFF
cd /d "%~dp0"
java -server -Dfile.encoding=UTF-8 -Xms1000M -Xmx1000M -cp "dist\DragonServer.jar;lib\mysql-connector-java-5.1.49.jar;lib\json_simple-1.1.jar;lib\joda-time-2.9.4.wso2v1.jar" server.Server
PAUSE
