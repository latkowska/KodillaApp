call C:\Users\latko\KodillaDeveloper\tasks\runcrud.bat
if "%ERRORLEVEL%" == "0" goto runchrome
echo.
echo Running ...\runcrud.bat caused errors
goto stop

:runchrome
@echo off
cd "C:\Pliki programów(x86)\Google\Chrome\Application\"
start chrome.exe http://localhost:8080/crud/v1/task/getTasks
goto finish

:stop
echo.
echo Stopped forced by errors

:finish
echo.
echo Work is finished.
