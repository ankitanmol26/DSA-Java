@echo off
rem Simple batch script to compile and run a Java program.
rem Usage: run_java.bat MyProgram.java

if "%~1"=="" (
    echo Usage: %~nx0 ^<JavaFile.java^>
    exit /b 1
)

rem Full path to source file
set "src=%~1"
rem Directory containing the source file
set "srcdir=%~dp1"
rem File name (with extension) without path
set "filename=%~nx1"
rem Class name without extension
set "classname=%~n1"

rem Change to source directory
pushd "%srcdir%"

rem Compile (no extra quotes needed as filename has no spaces)
javac %filename%
if errorlevel 1 (
    echo Compilation failed.
    popd
    exit /b 1
)

rem Run
java %classname%
if errorlevel 1 (
    echo Runtime error.
    popd
    exit /b 1
)

popd
exit /b 0
