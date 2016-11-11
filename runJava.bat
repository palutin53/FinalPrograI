@ECHO OFF
cd %~dp1
ECHO Compiling %~nx1...
IF EXIST %~n1.class (
DEL %~n1.class
)
javac -Xlint:unchecked %~nx1
IF EXIST %~n1.class (
ECHO Running %~n1...
start cmd /k java -ea %~n1
)