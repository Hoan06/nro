@ECHO OFF
cd /d "%~dp0"
if not exist build\classes mkdir build\classes
if not exist dist mkdir dist
dir /s /b src\*.java > build\sources.txt
javac -encoding UTF-8 -cp "lib\mysql-connector-java-5.1.49.jar;lib\json_simple-1.1.jar;lib\joda-time-2.9.4.wso2v1.jar" -d build\classes @build\sources.txt
if errorlevel 1 (
    pause
    exit /b 1
)
set "JAR_EXE=jar"
where jar >nul 2>nul
if errorlevel 1 (
    if exist "C:\Program Files\Java\jdk-24\bin\jar.exe" set "JAR_EXE=C:\Program Files\Java\jdk-24\bin\jar.exe"
)
"%JAR_EXE%" cfe dist\DragonServer.jar server.Server -C build\classes .
if /I not "%~1"=="nopause" pause
