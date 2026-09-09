@echo off
title Java Calculators Terminal
:menu
cls
echo ====================================
echo      Java Calculators Launcher
echo ====================================
echo 1. Run Temperature Converter (Converter.java)
echo 2. Run Calculator (MATHTEST.java)
echo 3. Exit
echo ====================================
set /p choice="Choose an option (1-3): "

if "%choice%"=="1" (
    cls
    java src/Converter.java
    echo.
    pause
    goto menu
)
if "%choice%"=="2" (
    cls
    java src/MATHTEST.java
    echo.
    pause
    goto menu
)
if "%choice%"=="3" (
    exit
)
goto menu
